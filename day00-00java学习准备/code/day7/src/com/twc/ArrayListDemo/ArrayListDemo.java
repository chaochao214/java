package com.twc.ArrayListDemo;

import java.util.ArrayList;

/*
arraylist 是大小可变数组的实现，存储在内的数组元素，此类提供一些方法来操作内部存储的元素。
arraylist 可不断增加元素， 其大小也不断增长

 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建学生数组
        ArrayList<String>  list = new ArrayList<>();
        //创建学生对象
        String s1 = "曹操";
        String s2 = "刘备";
        String s3 = "孙权";

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(int i = 0; i< 3;i++){
            System.out.print(list.get(i));
        }


    }
}
