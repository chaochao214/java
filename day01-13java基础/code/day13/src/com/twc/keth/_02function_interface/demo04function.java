package com.twc.keth._02function_interface;

import java.util.function.Function;

public class demo04function {
    public static void main(String[] args) {
         fun(t-> Integer.parseInt(t));
         fun(Integer::parseInt);
    }
    public static void fun(Function<String,Integer>  lambda){
        int a = lambda.apply("123");
        System.out.println( a);
    }
}
