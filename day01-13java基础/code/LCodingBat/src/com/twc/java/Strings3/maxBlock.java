package com.twc.java.Strings3;

import java.util.ArrayList;
import java.util.Iterator;

public class maxBlock {
    public static void main(String[] args) {


    }

    // 还是做不出来
    public int maxBlock2(String str) {
        char[] a = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        Iterator<Character> it = list.iterator();
        char b = ' ';
        while (it.hasNext()) {
            char c = it.next();

        }
        return 0;
    }

    /*
   sumNumbers("abc123xyz") → 123
   sumNumbers("aa11b33") → 44
   sumNumbers("7 11") → 18
     */
    public int sumNumbers(String str) {
        return  0;
    }
    /*
    notReplace("is test") → "is not test"
    notReplace("is-is") → "is not-is not"
    notReplace("This is right") → "This is not right"
     */

    public String notReplace(String str){
        str.replaceAll(" is ", " is not");
        //str.replaceAll("",)
        return   str;
    }
}
