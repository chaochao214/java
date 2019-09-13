package com.itheima.Lottery2;

import java.util.Arrays;

public class LottreyTest {
    public static void main(String[] args) {
        //要实现的功能
        //随机生成6个随机数-> 中奖的红球
        //  1个随机数 中奖篮球

        //随机生成6个随机数 -> 我的红
        //键盘录入一个数字   我的篮球

        // 计算相同的红球个数
        //判断篮球是否相同
        //开奖计算

        Lottery lot2  = new Lottery();

        int[] luckeyRedBall =   lot2.getLuckeyRedball();
        int  luckeyBlueBall  = lot2.getLuckeyBlueBall();

        System.out.println(Arrays.toString(luckeyRedBall));
        System.out.println(luckeyBlueBall);

        int[]  myRedBall  = lot2.getRedBall();
        int  myBlueBall = lot2.getBlueBall();

        System.out.println(Arrays.toString(myRedBall));
        System.out.println(myBlueBall);

        lot2.getNumber(luckeyRedBall,luckeyBlueBall,myRedBall,myBlueBall);
    }
}
