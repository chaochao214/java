package com.twc.systemDemo;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s ="hello";
        s += "world";
        System.out.println(s);
        StringBuilder a    = new StringBuilder();
        a.append("hello").append("world");
        System.out.println(a);
        //自动装箱
        Integer i  =4;
        //自动拆箱
        i = i +5;
         int  num1  = Integer.parseInt("100");
        System.out.println(num1);

    }
}
