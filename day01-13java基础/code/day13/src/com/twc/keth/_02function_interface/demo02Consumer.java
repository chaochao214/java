package com.twc.keth._02function_interface;

import java.util.function.Consumer;

public class demo02Consumer {
    public static void main(String[] args) {
        //  fun(t-> System.out.println(t));
         fun(System.out::println);
    }
    public static void fun(Consumer<String> lambda) {
        lambda.accept("hello");
    }
}
