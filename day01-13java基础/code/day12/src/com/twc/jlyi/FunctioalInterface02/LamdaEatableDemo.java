package com.twc.jlyi.FunctioalInterface02;

public class LamdaEatableDemo {
    public static void keepAlive(Eatable human){
        human.eat();
    }

    public static void main(String[] args) {
        keepAlive(()-> System.out.println("饭"));
    }

}
