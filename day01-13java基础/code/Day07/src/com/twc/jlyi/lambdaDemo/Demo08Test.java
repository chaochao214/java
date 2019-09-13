package com.twc.jlyi.lambdaDemo;

public class Demo08Test {
    public static void main(String[] args) {

        invokeCalc(120, 130, (a, b) -> a + b);


    }

    public static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是" + result);

    }
}
