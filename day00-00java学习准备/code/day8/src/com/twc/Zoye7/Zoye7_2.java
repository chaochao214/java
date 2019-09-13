package com.twc.Zoye7;

public class Zoye7_2 {
    public static void main(String[] args) {

    }

    public static String toString(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return " []";
        }
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i] + "]";
            } else {
                s += arr[i] + ", ";
            }
        }
        return s;

    }

}
