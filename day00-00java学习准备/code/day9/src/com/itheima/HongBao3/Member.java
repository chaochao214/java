package com.itheima.HongBao3;

import java.util.ArrayList;

public class Member extends User {

    public Member() {

    };
    public Member(String userName,double leftMoney){
        this.userName = userName;
        this.leftMoney = leftMoney;
    }
    public void openHongBao(ArrayList<Double> list) {
        leftMoney =list.get(0);


    }


}
