package com.twc.zoye.zoye3;

public class test {
    public static void main(String[] args) {
        MyRunnable r= new MyRunnable();
        Thread  t  =new Thread( r);
        t.start();

        ExtendsfThread th =new ExtendsfThread();
        th.start();

    }

}
