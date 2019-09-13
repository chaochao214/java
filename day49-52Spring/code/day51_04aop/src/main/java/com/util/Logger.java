package com.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author: twc
 * @Date 2019/5/30 10:26
 **/
public class Logger {
    /**
     * 前置通知
     */
    public void beforePointLog(JoinPoint jp) {
        System.out.println("前置通知++++");
    }

    public void afterReturningPrintLog(JoinPoint jp) {
        System.out.println("后置通知开始记录数据");
    }

    public void printLog() {
        System.out.println("log类中的printLog开始记录日志了");
    }

    /**
     * 异常通知
     */
    public void afterThrowingPrintLog(JoinPoint jp) {
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(JoinPoint jp) {
        System.out.println("最终通知Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

    public Object aroundPrinLog(ProceedingJoinPoint pjp) {
        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();
            System.out.println("logger类中的arroundPrintLog开始记录数据");
            rtValue = pjp.proceed(args);
            System.out.println("logger类中的arroundPrintLog开始记录数据+后置");
            return rtValue;

        } catch (Throwable throwable) {
            System.out.println("loggre类 异常");
            throw new RuntimeException(throwable);

        } finally {
            System.out.println("logger类中的arroundprinLog开始执行了");

        }
    }

}
