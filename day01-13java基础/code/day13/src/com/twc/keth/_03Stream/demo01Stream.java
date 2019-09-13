package com.twc.keth._03Stream;

import java.util.ArrayList;
import java.util.List;

public class demo01Stream {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        list.add("name4");
        list.stream().filter(s->s.startsWith("n")).filter(s->s.endsWith("4"))
                .forEach(System.out::println);
    }
    private static void demo01(List<String> list){
        ArrayList<String> one = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                one.add(s);
            }

        }
    }



}
