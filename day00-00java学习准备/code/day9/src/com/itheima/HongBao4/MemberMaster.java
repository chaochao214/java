package com.itheima.HongBao4;

import java.util.ArrayList;

public class MemberMaster extends User {
    public MemberMaster() {

    }

    public MemberMaster(String UserName, double leftMoney) {
        super(UserName, leftMoney);
    }

    ArrayList<Double> list = new ArrayList<>();

    //发红包，自己身上有的钱， 给别人发的钱
    public ArrayList<Double> send(int money, int num) {
        if (money > getLeftMoney()) {
            System.out.println("发红包金额大于群主剩余金额");
            return null;
        }
        //设置群主剩余金额
        setLeftMoney(getLeftMoney() - money);
        //计算每个红包金额
        money = money * 100;
        int a = money / num;
        //计算剩下的金额数
        int b = money % num;
        for (int i = 0; i < num - 1; i++) {

            list.add((double) a / 100);
        }
        //取出list中的最大值

        double max = (double) (a + b) / 100;
        list.add(max);
        return list;
    }

}
