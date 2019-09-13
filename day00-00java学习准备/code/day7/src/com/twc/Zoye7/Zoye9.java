package com.twc.Zoye7;

import java.util.Random;
import java.util.Scanner;

public class Zoye9 {
    public static void main(String[] args) {
    test();
    }

    public static void test() {
    Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个2-5之间的数字");
        int num = sc.nextInt();
        Random rm = new Random();
        int[] arr = new int[5];
        for(int i = 0;i< arr.length;i++){
            arr[i]= rm.nextInt(100);
            System.out.print(arr[i]+",");
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%num==0){
                System.out.println();
                System.out.println("arr["+i+"]可以被"+num+"整除");
            }
        }







    }
}
