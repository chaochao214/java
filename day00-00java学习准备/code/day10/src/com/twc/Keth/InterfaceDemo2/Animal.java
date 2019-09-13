package com.twc.Keth.InterfaceDemo2;

public class Animal implements liveAble{

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void fly() {
        System.out.println("Animal天上飞");
    }
    public static void run(){
        System.out.println("跑起来");
    }
}
