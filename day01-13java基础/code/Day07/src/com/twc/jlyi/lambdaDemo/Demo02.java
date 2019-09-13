package com.twc.jlyi.lambdaDemo;

public class Demo02 {
    public static void main(String[] args) {
        invokeCook(()-> {
            System.out.println("吃饭了");
        });
    }
    // 接口可以直接作为参数传入么
    private  static   void invokeCook(Cook cook){
        cook.makeFood();

    }
}
