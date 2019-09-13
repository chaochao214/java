package com.twc.keth._01review;

public class Demo01 {
    public static void main(String[] args) {
        print(new MyInter() {
            @Override
            public int getSum(int a, int b) {
                return a + b;
            }
        });
        print(new MyClass()::get);
        //    print(this::print);

    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(MyInter lambda) {
        int sum = lambda.getSum(10, 20);
        System.out.println(sum);
    }

}
