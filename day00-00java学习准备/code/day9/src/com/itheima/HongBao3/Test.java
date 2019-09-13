package com.itheima.HongBao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Member m1 = new Member("黄帆",16);
        Member m2 = new Member("田文超",23);
        Member m3 = new Member("组长",22);
        Member m4 = new Member("老师",40);
        //实例化群主,输入 红包大小个数
        QunZhu qz = new QunZhu();
        qz.setUserName("群主");
        qz.leftMoney=200;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int  money = sc.nextInt();
        System.out.println("请输入红包个数");
        int  num = sc.nextInt();
        //发红包
        ArrayList<Double> list = qz.send(money,num);
        //收红包
        m1.openHongBao(list);
        m2.openHongBao(list);
        m3.openHongBao(list);
        m4.openHongBao(list);

        System.out.println(qz.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());


    }

}
