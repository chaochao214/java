package com.twc.test;

import java.util.ArrayList;
import java.util.Collection;

public class forDemo{
    public static void main(String[] args) {
        Collection<String> coll  = new ArrayList<String>();
        ((ArrayList<String>) coll).add("小河神");
        ((ArrayList<String>) coll).add("老河神");
        ((ArrayList<String>) coll).add("神婆");
        for(String s:coll){
            System.out.println(s);
        }


    }
}
