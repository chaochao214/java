package com.twc.jlyi;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mt  = new MyThread("小李");
        mt.start();

        for(int i =0 ; i< 20; i++){
            System.out.println("___"+i);
        }
    }
}
