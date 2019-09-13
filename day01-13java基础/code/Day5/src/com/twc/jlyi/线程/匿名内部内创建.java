package com.twc.jlyi.线程;

public class 匿名内部内创建 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
