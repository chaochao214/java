package com.twc.keth._02function.demo01;

public class test {
    public static void main(String[] args) {
        fun2(()-> System.out.println("测试仪"));
    }
    public static void fun2(MyInner lambda){
        lambda.fun();
    }
}
