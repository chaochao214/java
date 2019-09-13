package com.twc.Interface;

public class Animal implements  liveble {

    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
}
