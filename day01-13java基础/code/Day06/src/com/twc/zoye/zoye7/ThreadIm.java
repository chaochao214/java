package com.twc.zoye.zoye7;

public class ThreadIm implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程执行____________");
        }

    }
}
