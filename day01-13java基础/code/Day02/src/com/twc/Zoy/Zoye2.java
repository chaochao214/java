package com.twc.Zoy;

import java.util.ArrayList;
import java.util.Collection;

public class Zoye2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
    }
    public static int listTest(Collection<String> list, String s){
        int count = 0;
        for( String s1:list){
            if(s1==s){
                count++;
            }
        }
        return count;

    }
}
