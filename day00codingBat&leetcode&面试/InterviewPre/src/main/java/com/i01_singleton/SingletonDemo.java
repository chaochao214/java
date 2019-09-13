package com.i01_singleton;

/**
 * @Author: twc
 * @Date 2019/5/27 14:36
 * 1。线程a访问getInstance () 方法，因为单例没有实例化， 所有进入代码块
 * <p>
 * 5. 理论上线程安全，并且实现懒加载
 **/
public class SingletonDemo {
    //volatile关键字，实现同步的功能问题

    private volatile static SingletonDemo instance;

    private SingletonDemo() {
        System.out.println("Singleton has loaded ");

    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }


}
