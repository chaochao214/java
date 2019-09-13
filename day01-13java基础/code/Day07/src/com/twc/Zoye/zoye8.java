package com.twc.Zoye;
//先锋扥的
public class zoye8 implements  Runnable {


    @Override
    public void run() {
        System.out.println( "需要一个老师");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( "老师来了"+Thread.currentThread().getName());
        System.out.println( "老师走了");

    }
}
