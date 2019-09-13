package com.twc.GenericDemo;

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemoTest {
    public static void main(String[] args) {
        // 子
        Collection<Integer> list1 = new ArrayList<Integer>();


     }
     //?  extends Number,代表的是Number类及其子类上限
    // ?  super Number,代表的是Number类及其父类，下限
     public static  void getElement(Collection<? extends Number > coll ) {

     }
   // 泛型的下限是什么。
    //  public
}
