package com.twc.zoye;

import java.util.ArrayList;

public class zoye5 {
    public static void main(String[] args) {
        ArrayList<String> s= new ArrayList<>( );
        s.add("name1");
        s.add("name2");
        s.add("name3");
        s.add("name4");
        s.add("name5");
        s.stream().limit(2).forEach(System.out::println);
        s.stream().skip(2).forEach(System.out::println);
    }
}
