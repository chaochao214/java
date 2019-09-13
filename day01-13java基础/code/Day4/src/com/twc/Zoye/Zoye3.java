package com.twc.Zoye;

import java.util.Collection;
import java.util.HashMap;

public class Zoye3 {
    public static void main(String[] args) {
        //创建hashmap
        HashMap<String,String> hm = new HashMap<>();
        //使用put元素
        hm.put("1","name");
        //hm.put("1","name");

        hm.put("2","name2");
        hm.put("3","name3");
        hm.put("4","name4");
       /* System.out.println(hm);
        hm.put("1","value1");
        System.out.println(hm);
       */
        System.out.println(hm.get("1"));

        //zoye5
       /* Collection<String> values = hm.values();
        System.out.println("---------");
        System.out.println(values);*/
    }
}
