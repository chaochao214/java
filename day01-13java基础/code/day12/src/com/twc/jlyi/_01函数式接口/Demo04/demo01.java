package com.twc.jlyi._01函数式接口.Demo04;
/*

  注解
  @functionalInterface

 */
public class demo01 {
    public static void doSomething(MyFunctionalInterface inter ){
        inter.myMethod();// 调用自定义的函数式接口方法
    }

    public static void main(String[] args) {
        doSomething(()-> System.out.println("lamda执行了"));
    }
}
