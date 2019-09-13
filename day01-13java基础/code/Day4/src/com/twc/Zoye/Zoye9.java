package com.twc.Zoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoye9 {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        int a = (new Scanner(System.in)).nextInt();
        Map<String,Integer> map =  new HashMap<>();
        map.put("北京",2001);
        map.put("北京2",2002);
        map.put("北京3",2003);
        map.put("北京4",2004);
        if(map.containsValue(a)){
            System.out.println(map.containsValue(a));
        }else{
            System.out.println("不不包含");
        }
    }



}
