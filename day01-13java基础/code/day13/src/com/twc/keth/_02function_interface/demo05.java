package com.twc.keth._02function_interface;

import java.util.function.Consumer;

public class demo05 {
    public static void main(String[] args) {
        fun( t-> System.out.println( t.toUpperCase()),t-> System.out.println(t.toUpperCase()));
    }
    public static  void fun(Consumer<String> one, Consumer<String> two){
        one.accept("hello");
        one.accept("hello2");
    }
}
