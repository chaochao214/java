package com.twc.keth._06MyTestDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testHa {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<TestDemo> clazz = TestDemo.class;
        TestDemo testDemo = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            boolean flag = method.isAnnotationPresent(MyAnno.class);
            if (flag) {
                method.invoke(testDemo);
            }
        }
    }

}
