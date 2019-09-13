package com.twc.keth._01reflect.BeanFactory;

public class BeanFactory {
    public static <T> T getBean(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("创建对象异常");
        }
        // ？？？为什么不抛出异常会报返回值异常。
    }

    public static <T> T getBean2(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw  new RuntimeException("创建对象异常");
    }
}
