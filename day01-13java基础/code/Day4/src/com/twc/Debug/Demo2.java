package com.twc.Debug;

import java.util.HashMap;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("输入字符串");
        String line  = new Scanner(System.in).nextLine();
        findChar(line);
    }
    private static void  findChar(String line){
        //创建一个集合存储字符，出现的次数
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < line.length(); i++) {
            char c =  line.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{

                Integer count  = map.get(c);
                map.put(c,++count);
            }
        }
    }

}
