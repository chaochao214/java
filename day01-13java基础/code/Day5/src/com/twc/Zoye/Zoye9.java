package com.twc.Zoye;

public class Zoye9 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        //在主方法中执行for循环
        for (int i = 0; i < 100; i++) {
            if(i%2 ==1){
                System.out.println(i);
            }
        }

    }
}
