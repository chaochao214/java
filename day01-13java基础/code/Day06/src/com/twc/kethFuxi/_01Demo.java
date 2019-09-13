package com.twc.kethFuxi;


public class _01Demo {
    public static void main(String[] args) {
        //主方法中，创建线程类的对象。
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.start();
        mt2.start();
        mt3.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("a");


            // 匿名对象开启方式
            new MyThread().start();
        }


    }
}