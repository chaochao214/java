package com.twc.jlyi.lambda表达式;

public class test {
    public static void main(String[] args) {
      invokeCook(()->{});   // invokeCook
    }
    private static void invokeCook(Cook cook){
        cook.makeFood();
    }

}
