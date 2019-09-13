package com.twc.zoye.zoye6;

public class ThreadM extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("子线程执行");
        }
    }
}
