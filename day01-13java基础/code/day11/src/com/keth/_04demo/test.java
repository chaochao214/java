package com.keth._04demo;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        String[] arr = {"zzz", "cba", "nba", "caa", "aba", "a", "aa"};
        Arrays.sort(arr,getComparator());
       // System.out.println(Arrays.sort(arr));
    }
    public static Comparator<String> getComparator(){
        /*return  new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return   o2.compareTo(o1);
            }
        };*/
        return (o1,o2)->o2.compareTo(o1);

    }
}
