package com.twc.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> list = new ArrayList<String>();
        //添加字符
        list.add("张三丰");
        list.add("李玲");
        list.add("高原");
        printArrayList(list);
    }
 //打印集合方法
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for(int i = 0; i< list.size();i ++){
            String s =  list.get(i);
            if(i!= list.size() - 1){
                System.out.print(s+"@");
            }else {
                System.out.print(s+"}");
            }
        }
    }
}