package com.comsumer;

import com.produce.impl.ProduceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: twc
 * @Date 2019/5/30 9:27
 **/
public class ClientCglib {
    public static void main(String[] args) {
        final ProduceImpl produce = new ProduceImpl();
        ProduceImpl cglibProducer = (ProduceImpl) Enhancer.create(produce.getClass(), new MethodInterceptor() {
            /**
             * 执行对象的任何方法都会经过该对象的问题
             */
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                Object returnvalue = null;
                // 获取方法执行的参数
                Float money = (Float) args[0];
                if ("saleProduct".equals(method.getName())) {
                    returnvalue = method.invoke(produce, money * 0.8f);
                }
                return returnvalue;

            }
        });
        cglibProducer.saleProduct(12000f);
    }
}
