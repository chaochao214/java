package com.twc.keth._03programing.demo01;

public class demo01_延迟执行 {
    public static void main(String[] args) {
          String  msgA = "s1";
          String  msgB = "s2";
          String  msgC = "s3";
          printMessage1(2,msgA+msgB+msgC);


    }
    public static void printMessage1(int level,String message){
        if(1==level){
            System.out.println("message");
        }
    }
    //
    public static  void printMessage2(int level,String...arr){
        if(1==level){
            String s= "";
            for (String s1 : arr) {
                s= s+ s1;
            }
            System.out.println("拼接完成");
            System.out.println(s);
        }
    }
    //为什么说用了lamb之后会延迟执行
    public static void printMessage3(int level,Logable lambda){
        if(1== level){
            System.out.println( lambda.printLog());
        }
    }

}
