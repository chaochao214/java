package com.itheima.HongBao;


import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QunZhu qz = new QunZhu("群主",200);
        //键盘录入
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入金额");
        int money  = sc .nextInt();
        System.out.println("请输入个数");
        int count  = sc.nextInt();

        //发送红包
        ArrayList<Double> sendList = qz.send(money, count);

        if(sendList == null){
            System.out.println("余额不足。。");
            return;
        }
        //创建三个成员
        Member m1  = new Member();
        Member m2  = new Member();
        Member m3  = new Member();
        //
        qz.setUserName("群主");
        m1.setUserName("用户一");
        m2.setUserName("用户二");
        m3.setUserName("用户三");

        //打开红包
        m1.openHongbao(sendList);
        m2.openHongbao(sendList);
        m3.openHongbao(sendList);
        //展示信息
        qz.show();
        m1.show();
        m2.show();
        m3.show();


    }
}
