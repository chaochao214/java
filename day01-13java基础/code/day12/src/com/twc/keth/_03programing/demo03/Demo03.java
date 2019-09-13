package com.twc.keth._03programing.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03 {
    public static void main(String[] args) {
        // 比较器的使用方法
        String[] s={"a","b","f","d"};
        Arrays.sort(s,compare());
        System.out.println( "排序后的结果是"+Arrays.toString(s));

    }
    public static Comparator<String> compare(){
       /* return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.compareTo(o2);
            }
        };*/
        return (o1,o2)->o2.compareTo(o1);

    }


}
