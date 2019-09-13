package com.twc.zoye.zoye2;

public class Test {
    public static void main(String[] args) {
        //  getProduct(1,3, (a,b)->a*b);
        getProduct(1, 3, new InCalc() {
            @Override
            public int calc(int a, int b) {
                return a * b;
            }
        });
    }

    static void getProduct(int a, int b, InCalc calc) {
        System.out.println(calc.calc(a, b));
    }

}
