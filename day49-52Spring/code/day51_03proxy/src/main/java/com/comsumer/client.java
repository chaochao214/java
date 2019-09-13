package com.comsumer;

import com.produce.Producer;
import com.produce.impl.ProduceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: twc
 * @Date 2019/5/30 9:10
 **/
public class client {
    public static void main(String[] args) {

        // 动态代理的相关问题需要看一下
        final Producer producer = new ProduceImpl();
        /**
         *  动态代理的方法，
         */
        Producer proxyProducer = (Producer) Proxy.newProxyInstance(producer.getClass().getClassLoader(), producer.getClass().getInterfaces(), new InvocationHandler() {
            /**
             * 作用：执行被代理对象的任何接口方法都会通过该方法，
             * @param proxy   代理对象的引用
             * @param method      当前执行的方法
             * @param args      当前执行方法所需要的参数
             * @return 和被代理对象方法有相同的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Object returnValue = null;
                Float money = (Float) args[0];
                if ("saleProduct".equals(method.getName())) {
                    returnValue = method.invoke(producer, money * 0.8f);
                }
                return returnValue;


            }
        });
        proxyProducer.saleProduct(1000f);
    }
}
