package com.twc.java.AP_1;

import java.util.ArrayList;
import java.util.Collections;

public class scoreIncreasing {

    public static void main(String[] args) {

    }

    public static boolean timu1(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] s = new String[n];
        ArrayList<String> s2 = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
           if(!s2.contains(a[i]))s2.add(a[i]) ;
        }
        for (int i = 0; i < b.length; i++) {
            if(!s2.contains(b[i]))s2.add(b[i]);
        }
        Collections.sort(s2);
        for (int i = 0; i < n; i++) {
            s[i] = s2.get(i);
        }
        return s;
    }
    public int bigHeights(int[] heights, int start, int end) {

      int count=0;
       for(int i= start;i<=end;i++){
           for (int j = 0; j < i; j++) {
               if(Math.abs(heights[i]-heights[j])==5){
                   count ++;
               }
           }
       }
       return count;
    }

}

