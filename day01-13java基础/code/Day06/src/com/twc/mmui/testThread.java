package com.twc.mmui;

/**
 * @Author: twc
 * @Date 2019/8/10 9:57
 **/
public class testThread {
    public static void main(String[] args) {

       MyThread  mt = new MyThread();
       mt.start();

       MyRunnable  mr =  new MyRunnable();
       Thread  mr1 =  new  Thread(mr,"mr1");
       mr1.start();
       Thread  mr2 =  new  Thread(mr,"mr2");
       mr2.start();



    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("runnable");
    }
}
