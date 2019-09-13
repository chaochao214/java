package com.twc.Zoye7;

public class Zoye4 {
    public  String test(String s){
        if(s.length()< 2){
            System.out.println("请输入长度大于2的字符串");
            return  s;
        }
        char a = s.charAt(s.length()-2);
        char b = s.charAt(s.length()-1);
        String s2 = s.substring(0,s.length()-2);
        return s2+b+a;
    }
}
