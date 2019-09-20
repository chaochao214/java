package com.twc;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myLoaderA = new MyClassLoader();
        Object obj = myLoaderA.loadClass("com.twc.JavaBean").newInstance();
        Object obj2= new JavaBean();
        System.out.println( obj.getClass());
        System.out.println( obj2.getClass());
    //类加载器都是什么鬼
        System.out.println( obj.getClass().getClassLoader());
        System.out.println( obj2.getClass().getClassLoader());
    }
}
