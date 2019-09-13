package com.twc.zoye.zoye7;

public class zoye7 {
    public static void main(String[] args) {
        ThreadIm ti =  new ThreadIm();
        new Thread(ti).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("+++++++++++++++++");
        }

    }
}
