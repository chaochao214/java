package com.twc.jlyi._01Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratror迭代器 {
    public static void main(String[] args) {
        Collection<String> coll  = new ArrayList<String>();
        coll.add(" name1");
        coll.add("name2");
        coll.add("name3");
        coll.add("name4");
        coll.add("name5");
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
        System.out.println("---------");
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
