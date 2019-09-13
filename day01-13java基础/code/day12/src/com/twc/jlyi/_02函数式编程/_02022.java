package com.twc.jlyi._02函数式编程;

import java.util.Arrays;
import java.util.Comparator;

public class _02022 {
    //排序问题 compartor 做为返回值对象
    public static void main(String[] args) {
        String[ ]  arr = {"aa","aaa","a"};
        Arrays.sort( arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, com());
        System.out.println(Arrays.toString(arr));

    }
    public static Comparator<String> com(){
        return (a,b)->b.length()- a.length();
    }
}
