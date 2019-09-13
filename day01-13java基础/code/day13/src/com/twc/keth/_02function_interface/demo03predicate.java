package com.twc.keth._02function_interface;

import java.util.function.Predicate;

public class demo03predicate {
    public static void main(String[] args) {
        fun(t-> t.contains("h")&&t.length()>3);
    }
    public  static void fun(Predicate<String> lambda){
        boolean b = lambda.test("hello");
        System.out.println( b);
    }
}
