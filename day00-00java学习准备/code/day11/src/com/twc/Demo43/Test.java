package com.twc.Demo43;

import java.util.ArrayList;
import java.util.List;

import static com.twc.Demo43.GetEvenNum.getEvenNum;


public class Test {
    public static void main(String[] args) {
    ArrayList<Integer>  list1 = new ArrayList<>();
        for(int i= 0;i<10;i++){
        list1.add(i);
        }
    List list = getEvenNum(list1);
        System.out.println(list);


    }

}
