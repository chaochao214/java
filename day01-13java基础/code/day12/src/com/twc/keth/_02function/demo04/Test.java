package com.twc.keth._02function.demo04;

public class Test {
    public static void main(String[] args) {
        fun((a,b)->a+b,100,200);
    }
    public static void fun(Sumable lambda,int a,int b){

        System.out.println(lambda.sum(a, b));
    }


}
