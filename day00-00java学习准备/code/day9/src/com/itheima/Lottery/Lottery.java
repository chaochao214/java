package com.itheima.Lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 存放彩票的所有功能

 */
public class Lottery {
    /*
        创建随机数对象
        扫描对象
     */
    private Random r = new Random();
    Scanner sc = new Scanner(System.in);


    /*
        获取中奖的6个红球

     */
    public int[] getLuckeyRedBall() {
        int[] arr = new int[6];
        int j = 0;
        int iIndex = 0;

        //使用循环
        //随机生成一个数字
        //判断是否存在        //随机数添加到数组中
        while (iIndex < 6) {
            //随机生成一个数字
            int i = r.nextInt(33) + 1;
            if (isContains(i, arr)) {
                continue;
            }
            arr[iIndex] = i;
            iIndex++;

        }
        Arrays.sort(arr);
        return arr;
    }

    /*
    获取中奖的篮球
     */
    public int getLuckeyBlueBall() {
        int j = r.nextInt(16) + 1;
        return j;
    }

    /*

       判断一个数是否存在
     */
    public boolean isContains(int a, int[] arr) {
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }
        //获取红球
    public int[] getRedBall() {
        int[] arr2 = new int[6];
        int index =0;
        while (index <6) {
            System.out.println(" 请输入猜测的红球号码（1-33）");
            int j = sc.nextInt();
            //判断是否输入有效
            if(j<1|| j>33){
                System.out.println("输入范围不对，请重新输入1-33");
                continue;
            }
            if(isContains(j,arr2)){
                System.out.println("输入重复，请重新输入");
                continue;
            }
            arr2[index] = j;
            index++;
        }
        Arrays.sort(arr2);
        return arr2;
    }

    //获取篮球
    public int getBlueBall(){
        while(true ){
            System.out.println("猜测篮球1-17");
            int i  =  sc.nextInt();
            if(i>0&&i<17){
                return i;
            }
            System.out.println("输入范围不对，请重新输入");
        }
}
/*
        获取相同元素的个数

 */

    public int getSameCount(int[] luckeyRedBall,int[]  redBall ) {
        int  count = 0;
        for (int i = 0; i < luckeyRedBall.length; i++) {
            for (int j = 0; j < redBall.length; j++) {

                if(luckeyRedBall[i] ==  redBall[j]){
                    count++;

                }
            }

        }
        return  count;
    }

    public boolean getBuleBallIsSame(int luckeyBlueBall, int blueBall) {
    if(luckeyBlueBall== blueBall){
        return true;


    }
    return false;

    }

    public void openLottery(int samRedCount, boolean isSame) {
        //先判断篮球是否相同
        if(isSame ==true){
            if(samRedCount == 5){
                System.out.println("1000块钱");
            }if(samRedCount == 4){
                System.out.println("200块钱");
            }if(samRedCount == 3){
                System.out.println("10块钱");
            }if(samRedCount == 2){
                System.out.println("五块钱");
            }if(samRedCount == 6){
                System.out.println("10000000块钱");
            }if(samRedCount == 1||samRedCount==0){
                System.out.println("五块钱");
            }

        }else{
            if(samRedCount == 5){
                System.out.println("200块钱");
            }if(samRedCount == 4){
                System.out.println("20块钱");
            }if(samRedCount == 3){
                System.out.println("10块钱");
            }if(samRedCount == 2){
                System.out.println("五块钱");
            }if(samRedCount == 6){
                System.out.println("10000000块钱");
            }if(samRedCount == 1||samRedCount==0){
                System.out.println("五块钱");
            }
        }

    }

    /*
        扫描输入测试
     */

}
