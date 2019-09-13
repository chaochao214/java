package com.twc.keth;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int a  = 10;
        int[] arr = {10,20,30};
        fun(a);
        fun(arr);

    }
    public static void fun(int i){
        System.out.println(i);
    }
    public static void fun(int[] array){

        System.out.println(array[0]);

    }
}
