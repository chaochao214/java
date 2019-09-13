package com.twc.keth.toStringDemo;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        String s = "abc";
        String s2= new String("abc");
        System.out.println(s== s2);
        System.out.println(Objects.equals(s,s2));
        System.out.println("+++++++++++++++++");
        Person p1 = new Person("twc",22);
        Person p2 = new Person("twc",22);
        System.out.println(p1.equals(p2));
    }
}
