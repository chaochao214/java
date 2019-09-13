package com.twc.Zoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoye8 {
    public static void main(String[] args) {
    //    ??什么集合可以用泛型，什么不可以用泛型  List<String>  list=  new List<String>();
        ArrayList<String> al  =  new ArrayList<>();
        al.add("abc");
        al.add("bcd");
        HashMap<Character,Integer>   hm = new HashMap<>();

        for(String str :al){
            char[]  charA = str.toCharArray();
            for(char a :charA){
                //？？?  APi里查不到这个方法
                Integer  num  = hm.get(a);
                if(num ==null){
                     hm.put(a,1);
                }else{
                    hm.put(a,num+1);
                }
            }
        }
        System.out.println(hm);
     }
}
