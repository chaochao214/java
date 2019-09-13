package com.twc.kethfuxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01Demo {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"name1");
        map.put(4,"name4");
        map.put(3,"name3");
        map.put(2,"name2");

        /* Set<Integer> set = map.keySet();
        System.out.println( map);
        for (Integer integer : set) {
            System.out.println(integer+ " -- "+map.get(integer));
        }*/
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }
    }



}






