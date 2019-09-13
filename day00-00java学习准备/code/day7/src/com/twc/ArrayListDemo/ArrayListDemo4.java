package com.twc.ArrayListDemo;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo4 {
    public static void main(String[] args) {
  //获取集合的方法。定义获取所有偶数元素集合的方法（arraylist类型作为返回值)
  // 写一个 getArrayList作为方法名字
        Random r = new Random();
        ArrayList<Integer>  list = new ArrayList<>();

        ArrayList<Integer>  smallList = new ArrayList<>();

        for(int i =1;i< 30;i++){
            list.add(r.nextInt(10));
        }
        smallList= getArrayList(list);
        for(int i=1 ;i<smallList.size();i++){
            int  b = smallList.get(i);
            System.out.println(b);
        }
      //  System.out.println(smallList);

    }

    public  static  ArrayList<Integer>  getArrayList(ArrayList<Integer> list){
            ArrayList<Integer>  smallList = new ArrayList<>();
            for(int i= 0; i<list.size();i++){
                if(list.get(i) %2  == 0 ){
                    smallList.add(list.get(i));
                }
            }
            return smallList;
    }

}
