package com.twc.zoye.zoye8;

public class ThreadI  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("______________");
        }
    }
}
