package com.i00_基础题目搜集._01demo;

/**
 *
 *  现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行？
 *
 */
public class demo {

    public static void main(String[] args) {
      //  method01();
        method02();
    }
    static  void method01(){
         Thread t1 =  new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("t1执行了");
          }
         });
       /*  Thread t2 = new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     t1.join();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("t2执行了");
             }
         });
         Thread t3=  new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     t2.join();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("t3执行了");
             }
         });
         t1.start();
         t2.start();
         t3.start();*/
    }

    static void method02(){
        Runnable runnable  = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t1= new Thread(runnable,"t1");
        Thread t2= new Thread(runnable,"t2");
        Thread t3= new Thread(runnable,"t3");


        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
