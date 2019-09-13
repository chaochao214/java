package com.twc.zoye.zoyeFuxi.zoye6;

public class demo {
    public static void main(String[] args) {
         new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < 100; i++) {
                     System.out.println("+++++");
                 }
             }
         }).start();

         new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < 100; i++) {
                     System.out.println("------");

                 }
             }
         }).start();


    }


}
