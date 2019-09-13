package com.twc.keth.fuxi;

public class _02threeThread {
    static int i = 1;
    public static void main(String[] args) {
        String s= "锁对象";

        new Thread(()->{
         while(true){
             synchronized (s){
                 while(i!=1){
                     try {
                         s.wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
              String name  =  Thread.currentThread().getName();
                 System.out.println( name);
                 i=2 ;
                 s.notifyAll();
             }
         }
        }).start();

        new Thread(()->{
            while(true){
                synchronized (s){
                   while(i!=2){
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    String name  =  Thread.currentThread().getName();
                    System.out.println( name);
                    i=3;
                    s.notifyAll();
                }
            }
        }).start();
        new Thread(()->{
            while(true){
                synchronized (s){
                   while(i!=3){
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    String name  =  Thread.currentThread().getName();
                    System.out.println( name);
                    i=1;
                    s.notifyAll();
                }
            }
        }).start();


    }
}
