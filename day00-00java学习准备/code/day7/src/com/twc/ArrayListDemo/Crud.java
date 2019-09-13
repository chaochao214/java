package com.twc.ArrayListDemo;

import java.util.ArrayList;

public class Crud {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String>  list  = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //返回输出的数值
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // list.size();

        //list.remove(0); list.remove(0);

    }




}
