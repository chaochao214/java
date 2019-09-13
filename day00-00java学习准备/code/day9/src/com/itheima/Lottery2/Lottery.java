package com.itheima.Lottery2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    //判断数组字符是否存在
    public boolean isContains(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (a == b[i]) {
                return true;
            }
        }
        return false;
}

    //获取红球幸运
    public int[] getLuckeyRedball() {
        int[] a = new int[6];
        int count = 0;
        while (count < 6) {
            int b = r.nextInt(10);
            if (isContains(b, a)) {

                continue;
            }
            a[count] = b;
            count++;
        }
        return a;
    }

    //获取幸运篮球
    public int getLuckeyBlueBall() {
        return r.nextInt(5);
    }
    //获取自己的红球
    public int[] getRedBall() {
        int count =0;
        int a[] =  new int[6];
         while(count<6){
             System.out.println("请输入红球1-10");
             int b = sc.nextInt();
             if(isContains(b,a)){
                 System.out.println("重复请重新输入");
                 continue;
             }
             a[count] = b;
             count++;
         }
         return  a;
    }
    //获取自己的篮球
    public int getBlueBall() {
        System.out.println("请输入篮球1-5");
        return sc.nextInt();
    }


    public void getNumber(int[] luckeyRedBall, int luckeyBlueBall, int[] myRedBall, int myBlueBall) {
        int  count = 0;
        for (int i = 0; i < 6; i++) {
            if(luckeyRedBall[i]==myRedBall[i]){
                count++;
            }
        }
        if(luckeyBlueBall==myBlueBall){
            System.out.println("篮球相同，有"+count+"个红球相同");

        }
        if(luckeyBlueBall!=myBlueBall){
            System.out.println("篮球不相同，有"+count+"个红球相同");

        }

    }
}
