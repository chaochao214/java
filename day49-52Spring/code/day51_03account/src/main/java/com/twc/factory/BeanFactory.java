package com.twc.factory;

import com.twc.service.AccountService;
import com.twc.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.ParameterMetaData;

/**
 * @Author: twc
 * @Date 2019/5/30 9:39
 **/
//用于创建Service的代理对象的工厂
public class BeanFactory {
    private AccountService accountService;
    private TransactionManager txManager;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setTxManager(TransactionManager txManager) {
        this.txManager = txManager;
    }
    /**
     * 获取service代理对象
     */
    //代理的作用
    public  AccountService getAccountService(){
         return (AccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                 accountService.getClass().getInterfaces(), new InvocationHandler() {
                     /**
                      *
                      * @param proxy
                      * @param method
                      * @param args
                      * @return
                      * @throws Throwable
                      */
                     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                         Object rtValue= null;
                         try{
                             //开启事务
                             txManager.beginTransaction();
                             //执行操作
                              rtValue= method.invoke(accountService,args);
                              //提交事务
                              txManager.commit();
                              //返回结果
                             return rtValue;

                         }catch (Exception e){
                              txManager.rollback();
                              throw new RuntimeException(e);
                         }finally {
                               txManager.release();
                         }
                     }
                 });
    }
}
