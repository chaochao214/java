package com.twc.Zoye7;
/*
定义一个方法,接收一个字符串,如果字符串的前两个字符和末尾的两个字符同时出现，就返回true，如“edited”，则返回true。
	思路:想要截取前两个和最后两个前提是字符串的长度至少要大于等于2

 */
public class Zoye1 {
    public static void main(String[] args) {
        String a  =  "abccccab";
        System.out.println(test(a));

    }
    public static boolean test(String s){
        String a   = s. substring(0,1);
        String b   = s. substring(s.length()-2,s.length()-1);

        return  a.equals(b);
    }


}
