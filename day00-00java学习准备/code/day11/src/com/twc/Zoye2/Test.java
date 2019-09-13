package com.twc.Zoye2;

public class Test {
    public static void main(String[] args) {
        new Inter() {
            @Override
            public void print() {
                System.out.println("你好匿名内部类");
            }
        }.print();
    }
}
