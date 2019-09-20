package com.twc.java.Strings3;

public class _03 {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));


    }

    public static boolean equalIsNot(String str) {
        int notCount = 0;
        int isCount = 0;
        while (str.contains("not")) {
            str = str.replaceFirst("not", "");
            notCount++;
        }
        while (str.contains("is")) {
            str = str.replaceFirst("is", "");
            isCount++;
        }
        return isCount == notCount ? true : false;
    }

    public boolean gHappy(String str) {
        str =str.replace("gg","");
        if(str.contains("g")) return false;
        return true;

    }


    }