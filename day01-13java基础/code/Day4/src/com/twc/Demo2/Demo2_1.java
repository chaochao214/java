package com.twc.Demo2;

import java.util.ArrayList;
import java.util.List;

public class Demo2_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // 多态
        list.add("abc");
        list.add("def");
        list.add("ghi");
        //代码重复。jdk9新特性
        List a = List.of(1, 2,"abs",true);
        System.out.println(a);
        System.out.println(list);
    }

}
