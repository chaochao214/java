package com.twc.GenericDemo;

        import java.util.ArrayList;
        import java.util.Collection;

public class GenericTspw {
    public static void main(String[] args) {
        Collection<Integer> list1  = new ArrayList<Integer>();

        getElement(list1);
        Collection<Integer> list2  = new ArrayList<Integer>();
        getElement(list2);
    }
    //怎么实现添加元素的操作
    public static void getElement(Collection<?> coll){
        for (Object o : coll) {
            System.out.println(coll);
        }
       // coll.add();
    }
}
