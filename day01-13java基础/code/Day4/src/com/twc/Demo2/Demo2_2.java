package com.twc.Demo2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo2_2 {
    public static void main(String[] args) {
        Set<String> str1 = Set.of("a","b","c");
        System.out.println(str1);

        Map<String,Integer> str2 = Map.of("a",1,"b",2);
        System.out.println(str2);

        List<String> str3  = List.of("a","b");
        System.out.println(str3);
    }
}
