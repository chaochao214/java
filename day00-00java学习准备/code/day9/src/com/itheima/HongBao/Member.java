package com.itheima.HongBao;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(){

    }
    public Member(String username ,double leftMoney){
       super(username,leftMoney);

    }
    //打开红包
    public void  openHongbao(ArrayList<Double> list){
/*

        Random r = new Random();
        int index = r.nextInt(list.size());
        //移除一个金额
        Double  money  = list.remove(index);
        //直接调用父类方法，设置到余额
        setLeftMoney(money);
*/


    }



}
