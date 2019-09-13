package com.twc.jlyi._03泛型.泛型通配符;

import java.util.ArrayList;
import java.util.Collection;

public class test {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        getElement(list1);

        System.out.println();
        Collection<String> list2 = new ArrayList<>();
        getElement(list2);

    }
    public  static void  getElement(Collection<?> coll ){

    }
    public static String fun(){
        System.out.println("test");
            return  "a";
    }

}
