package com.twc.java.Strings3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countTriple {
    public static void main(String[] args) {
        // countTriple2("XXXXXabc" );

        //System.out.println('0' + 0);
        char a = 'a';
        char b= 'a';
        System.out.println(a == b);

        System.out.println(sameEnds("abXYab")+"=====");

    }

    public static int countTriple2(String str) {
        //感觉是题目错了，或者题目意思理解的不对
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 0);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        int count = 0;
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            if (map.get(key) == 3) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {

                //  sum+= (int) str.charAt(i);
                Integer.parseInt(String.valueOf(str.charAt(i)));

            }
        }
        return sum;
    }

    /**
     * public int sumDigits(String str) {
     * int sum =0;
     * for (int i = 0; i < str.length(); i++) {
     * if(Character.isDigit(str.charAt(i))){
     * sum+= (str.charAt(i)-48);
     * }
     * }
     * return sum;
     * }
     * <p>
     * /
     * <p>
     * }
     */

    // 这个问题用双指针来解决
    public static String sameEnds(String string) {
        //第一种方法想法错了，不可行
       /* int len = 1;
        String start = string.substring(0, len);
        String end = string.substring(string.length() - len, string.length());
        while (start.equals(end)) {
            len++;
            start = string.substring(0, len);
            end = string.substring(string.length() - len, string.length() );
            return string.substring(0,len);
        }*/


       int len = (string.length()+1)/2;
       int i=0, j=0; int max= 0;
       while(j+len<string.length()+1){
           char a = string.charAt(i);
           char b = string.charAt(j+len-1);
           if(a==b){
               i++;
               j++;
               max = max>i?max:i;
           }
           if(a!=b){
               max = max>i?max:i;
               i=0;
               j++;

           }
       }

       return  string.substring(0,max);


    }


}
