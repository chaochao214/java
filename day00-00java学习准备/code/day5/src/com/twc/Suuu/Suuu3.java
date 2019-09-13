package com.twc.Suuu;

public class Suuu3 {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            isPrime(i);

        }

    }


    public static void isPrime(int a) {
        for (int i = 2; i <= a; i++) {

            if (a % i == 0 && a != i) {
               // System.out.println("被整除，跳出" + i);
                break; // System.out.println((13%13==0 && 13==13));
            }

            if (a % i != 0 && a != i) {
                //System.out.println("没有被整除" + i);
                continue;
            }
            if (a % i == 0 && a == i) {
                System.out.println(a + "是素数");
            }


        }


    }
}
