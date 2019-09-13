package com.itheima.HongBao2;

import java.util.ArrayList;

public class QunZhu extends User{


    public  ArrayList<Double> send(int money,int count){
        double leftMoney  = getLeftMoney();
        if(money>leftMoney){
            return null;
        }
        //群主的金额
        setLeftMoney(leftMoney - money);
        //计算 每人能分到的红包钱数
        money  = money * 100 ;

        int  m  = money/count;
        int  n  = money%count;

        ArrayList<Double> list  = new ArrayList<Double>();
        if(n==0){
            list.add( (double)m/100);
        }else {
            list.add(m / 100.00);
        }


        return  list;
    }


}
