package com.twc.Zoye7;

import java.util.Arrays;
import java.util.Scanner;

public class Zoye7 {
    public void test() {
        int[] arr = {1, 8, 26, 45, 60, 78};
        Arrays.sort(arr);
        int[] newArr = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        /*System.out.println("输入一个1-100之间的数字");
        int a = sc.nextInt();
        //判断数字是否符合要求
        if (a > 100 || a < 0) {
            System.out.println("输入错误，请重新输入");
            return;
        }*/
        int a ;
        while(true){
            System.out.println("请输入一个1-100之间的数字");
             a  = sc.nextInt();
            if (a >=0  && a<=100) {
              break;
            }
            System.out.println("输入错误，请重新输入");
        }


        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] =  a;
        Arrays.sort(newArr);
        for(int i= 0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }


}



