package com.twc.Keth.InterfaceDemo;

public class Dog extends Animal implements LookDoorAble {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("狗睡觉");

    }

    @Override
    public void LookDoorAble() {
        System.out.println("狗看家");
    }
}
