package com.twc.jlyi._03泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 泛型测试 {
    public static void main(String[] args) {
        //这里如何用泛型来改写 ,注意：这里只能用泛型接口???
        //Collection<E> list  =   new ArrayList<>();
        Collection<String> list  = new ArrayList<>();
        list.add("abc");
        list.add("itcat");
        list.add("itcattest");
        Iterator<String> it =  list.iterator();
        while(it.hasNext()){
            String s= it.next();
            System.out.println( s);
        }
    }
}
