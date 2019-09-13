package com.twc.java.Warmup2;

public class StringTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
    }

    public static String stringTimes(String str, int n) {
        String s = str;
        int count = 0;
        while (count < n) {
            str += s;
            count++;
        }
        return str;
    }

    // frontTimes;
    public static String frontTimes(String str, int n) {
        if (n == 0) {
            return "";
        }
        String result = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                result += str;
            }
            return result;
        }
        String s = str.substring(0, 3);
        for (int i = 0; i < n; i++) {
            result += s;
        }
        return result;
    }
}
