package com.twc.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * @Author: twc
 * @Date 2019/5/29 21:05
 **/
@Component
@Aspect
public class TransactionManager {
    @Autowired
    private ConnectionUtils connectionUtils;

    @Pointcut(value = "execution(* com.twc.service..*.*(..))")
    public void pc() {
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    /**
     * 开启事务
     */
//    @Before(value = "pc()")
    public void beginTransaction() {
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     */
//    @AfterReturning(value = "pc()")
    public void commit() {
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @AfterThrowing(value = "pc()")
    public void rollback() {
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @After(value = "pc()")
    public void release() {
        try {
            connectionUtils.getThreadConnection().close();
            connectionUtils.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Around(value = "pc()")
    public  Object  around(ProceedingJoinPoint joinPoint){
         Object returnValue= null;
        try {
            // 开启实物
            this.beginTransaction();
            returnValue= joinPoint.proceed(joinPoint.getArgs());
            this.commit(); //提交事务
        }  catch (Throwable throwable) {
             throwable.printStackTrace();
             this.rollback();
        }finally {
            this.release();
        }
        return  returnValue;
    }



}
