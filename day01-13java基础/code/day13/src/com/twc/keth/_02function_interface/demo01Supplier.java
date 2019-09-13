package com.twc.keth._02function_interface;

import java.util.function.Supplier;

public class demo01Supplier {

    public static void main(String[] args) {
        fun(()->"Hello");
    }
    public static  void  fun(Supplier<String> lambda){
        String s = lambda.get();
        System.out.println(s);
    }
}
