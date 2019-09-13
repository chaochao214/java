package com.twc.keth.fuxi;

public class _01demo {
    //创建int标记变量
     static int flag= 1;
    ///多线程间通信
    /// notifyall();
    public static void main(String[] args) {
       String s= "锁对象";
       //创建标记变量,创建锁对象

        new Thread(()->{
            while(true){
                synchronized (s){
                    // if和while
                    while(flag!=1){
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //不是1
                    System.out.println(Thread.currentThread().getName());
                    flag=2;
                    s.notifyAll();
                }
                synchronized (s){
                    while(flag!=2){
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //不是1
                    System.out.println(Thread.currentThread().getName());
                    flag=3;
                    s.notifyAll();
                }

                synchronized (s){
                    while(flag!=3){
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //不是1
                    System.out.println(Thread.currentThread().getName());
                    flag=1;
                    s.notifyAll();
                }
            }

        }).start();



    }

}
