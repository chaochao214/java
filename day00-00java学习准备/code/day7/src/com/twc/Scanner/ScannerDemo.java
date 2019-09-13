package com.twc.Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = sc.nextInt();
        //输出数据
        System.out.println("i="+i);

    }
}

