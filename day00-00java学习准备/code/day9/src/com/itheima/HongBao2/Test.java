package com.itheima.HongBao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //定义用户
        Member a1 = new Member("l",0);
        Member a2 = new Member("小明", 0);
        Member a3 = new Member("武器",0);


        ArrayList<Double> list = new ArrayList<>();
        //输入红包金额和个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int  money = sc.nextInt();
        System.out.println("请输入红包个数");
        int count = sc.nextInt();
        //发红包  实例化 qunzhu
        QunZhu qz  = new QunZhu();
        qz.setUserName("群主");
        qz.setLeftMoney(200);
        list= qz.send(money,count);
        //拿红包
        a1.openHongbao(list);
        a2.openHongbao(list);
        a3.openHongbao(list);
        //最后展示
        System.out.println(qz.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

    }



}
