package com.twc.keth._04方法引用.demo04;

public class test {
    public static void main(String[] args) {
        //匿名内部类
        printAbs(a->Math.abs(-5));
        printAbs(Math::abs);

    }
    //lambda  表达式
    public static void printAbs(Calcable lambda){
        //打印出绝对值
        System.out.println(lambda.abs(-5));
    }
}
