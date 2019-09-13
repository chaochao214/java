package com.twc.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll  = new ArrayList<String>();
        coll.add("手抓饼");
        coll.add("大盘鸡");
        coll.add("兰州拉面");

        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
    }



}
