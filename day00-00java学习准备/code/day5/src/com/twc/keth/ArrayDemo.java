package com.twc.keth;

public class ArrayDemo {
    // 数组作为方法的参数
    public static void main(String[] args) {
        int i = 10;
        fun(i);
        int[] arr = {10, 20, 30};
        fun(arr);
    }

    public static void fun(int i) {
        System.out.println(i);
    }

    public static void fun(int[] arr) {
        System.out.println(arr);
    }
}
