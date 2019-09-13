package com.keth._03demo;

public class test {
    public static void main(String[] args) {
        /*startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启线程");
            }
        });*/
        startThread(()-> System.out.println("开启线程"));
    }
    public static void startThread(Runnable lamda){
         new Thread(lamda).start();
    }
}
