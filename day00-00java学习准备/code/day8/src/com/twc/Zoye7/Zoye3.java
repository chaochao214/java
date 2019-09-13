package com.twc.Zoye7;

/*
定义一个方法,接收一个字符串和一个数字，返回一个由原字符串中前n个字符和后n个字符组成的字符串,
字符串长度至少为n个。
	例如:method("heimaitcast",3) 结果:heiast

 */
public class Zoye3 {
    public   String test(String s,int n){
        String a = s.substring(0,n);
        System.out.println("a="+a);
        String b = s.substring(s.length()-n-1,s.length()-1);
        System.out.println("b="+b);
        // 1234
        return a.concat(b);
    }



}
