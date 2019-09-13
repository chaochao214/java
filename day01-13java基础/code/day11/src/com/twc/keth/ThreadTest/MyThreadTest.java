package com.twc.keth.ThreadTest;

public class MyThreadTest {
    public static void main(String[] args) {
         MyThread mt  = new MyThread();
         MyThread mt2  = new MyThread();
         MyThread mt3  = new MyThread();

         mt.start();
         mt2.start();
         mt3.start();
          new MyThread().start();

    }
}
