package com.twc.day7;

import java.util.Scanner;

public class Zoye1 {
    public static void main(String[] args) {

        test1();

    }

    public static  void test1(){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int temp = a>b?a:b;
        int max  = temp> c?temp:c;
        System.out.println(max);
    }



}
