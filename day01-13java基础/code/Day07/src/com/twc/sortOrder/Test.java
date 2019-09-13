package com.twc.sortOrder;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] s= {"aab","ca","bb"};
        Arrays.sort(s);
        Arrays.sort(s, new StringCompare());
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
