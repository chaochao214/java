package com.twc.test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        //多态形式创建对象
        //?????????为什么一定要用多态创建对象
        Collection<String> coll = new ArrayList<String>();
        ArrayList<String> coll2 = new ArrayList<String>();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);
        System.out.println(coll.contains("扫地僧"));
        coll.remove("石破天");
        System.out.println(coll);

    }



}
