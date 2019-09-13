package com.itheima.HongBao2;

import java.util.ArrayList;

public class Member  extends User{
    public Member(){};
    public Member(String username,double leftMoney ){
        super(username,leftMoney);

    };
    public void openHongbao(ArrayList<Double> list){
        Double  money  = list.get(0);

       // User a = new  User();
        setLeftMoney(money);

    }
}
