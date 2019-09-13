package com.twc.Demo3;

public class Demo171 {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            num =  num*26+ (s.charAt(i) -65);
        }
        return num;
    }
}
