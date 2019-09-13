package com.twc.keth.ThreadTest;

public class MyThread extends  Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "正在运行");
    }
}
