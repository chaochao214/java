package com.twc.Keth.InterfaceDemo;

public class Cat extends Animal implements CatchMouseAble {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡");
    }

    @Override
    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }

}
