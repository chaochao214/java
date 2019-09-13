package com.itheima.HongBao4;

public class Test2 {
    public static void main(String[] args) {
            int a = 100;
            int b  = 3;
            int a1 =a*100;
            int perMoney = a1/b;
            int leftMoney = a1%b;

        System.out.println(perMoney);
        System.out.println(leftMoney);
        System.out.println("---");
        System.out.println((double)perMoney/100);
        System.out.println((double)(perMoney+leftMoney)/100);

    }
}
