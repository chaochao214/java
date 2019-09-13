package com.itheima.HongBao4;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {

    }

    public Member(String UserName, double leftMoney) {
        super(UserName, leftMoney);
    }

    //随机获取一个红包,只有最后一个红包是 最大的
    Random r = new Random();

    public void openRedPocket(ArrayList<Double> list) {

        int a = r.nextInt(list.size());
        setLeftMoney(list.get(a));

        //获取最大的红包数值max
       // if(list.get(a) == )
        System.out.println("抢到了红包" + list.get(a));
        list.remove(a);
    }

}


