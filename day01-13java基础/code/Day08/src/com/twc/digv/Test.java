package com.twc.digv;

public class Test {
    //递归
    public static void main(String[] args) {
            method();
    }
    public static void  method(){
        System.out.println("method");
        //自己调用自己
        method();
    }


}
