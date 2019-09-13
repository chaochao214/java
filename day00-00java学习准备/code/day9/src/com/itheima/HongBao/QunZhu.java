package com.itheima.HongBao;

import java.util.ArrayList;

public class QunZhu  extends  User {
    //添加构造方法
    public  QunZhu(){

    };

    public QunZhu(String userName, double leftMoney) {
        super(userName, leftMoney);
    }

    /*
    群主发红包了

     */
    public ArrayList<Double> send(int money, int count ){
        double leftMoney =  getLeftMoney();
        if(money> leftMoney) {
        return null;

        }
        //修改群主余额
        setLeftMoney(leftMoney -money);
       //保存等份金额
        ArrayList<Double> list = new ArrayList<>();
        //扩大100倍，相当于拆分算成分为单位，
        money = money * 100;
        //每份的金额
        int  m = money /count ;
        int  l = money % count;
        for( int i = 0 ; i < count -1 ; i ++){

            list.add(m/ 100.0);
        }
        //判断是否被整除
        if (l == 0) {
        // 能整除, 最后一份金额,与之前每份金额一致
            list.add(m / 100.0);
        } else {
        // 不能整除, 最后一份的金额,是之前每份金额+余数金额
            list.add((m + l) / 100.00);
        }
        return list;
    }
    }




