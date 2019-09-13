package com.twc.kethFuxi;

public class _02Demo {
    public static void main(String[] args) {
        MyRunnable  mr =new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        // thread的start 方法开启线程。
        t1.start();
        t2.start();
        t3.start();
        new Thread(mr).start();
        //
    }

}
