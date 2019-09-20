package com.twc.Demo1;

import java.util.ArrayList;

public class Demo08 {
    public int myAtoi(String str) {
        ArrayList<Character> list   = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)>='0' && str.charAt(i)<='9'|| str.charAt(i)=='-'){
                        list.add(str.charAt(i));
                }
        }
      // int[] a = list.toArray();
        return 0;
    }

}
