package com.itheima.Lottery;
/*

 彩票的测试

 */

import java.util.Arrays;

public class LotteryTest {
    public static void main(String[] args) {
        //随机生成6个随机数-> 中奖的红球
        //  1个随机数 中奖篮球

        //随机生成6个随机数 -> 我的红
        //键盘录入一个数字   我的篮球

        // 计算相同的红球个数
        //判断篮球是否相同
        //开奖计算

        Lottery lot = new Lottery();
        int[] luckeyRedBall = lot.getLuckeyRedBall();
        int luckeyBlueBall = lot.getLuckeyBlueBall();

        System.out.println(Arrays.toString(luckeyRedBall));
        System.out.println(luckeyBlueBall);

        //输入红球和篮球数字
        int[]  redBall = lot.getRedBall();
        int    blueBall = lot.getBlueBall();


        System.out.println(Arrays.toString(redBall));
        System.out.println(blueBall);

       int samRedCount  = lot.getSameCount(luckeyRedBall,redBall);
       boolean isSame =  lot.getBuleBallIsSame(luckeyBlueBall,blueBall);

       //开奖
        lot.openLottery(samRedCount,isSame);

    }
}
