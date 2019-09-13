package com.i01_singleton;

/**
 * @Author: twc
 * @Date 2019/5/27 11:28
 **/
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        System.out.println("空构造器");
    }

    //内部类
    private static class Singleton {
        private static Singleton singleton = new Singleton();

    }
    public  static   Singleton getInstance(){
        return  Singleton.singleton;
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime());
    }
}
