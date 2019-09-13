package com.itheima.HongBao;

public class User {
    // 成员变量
    private String userName;
    private double leftMoney;
    //构造方法

    public User() {
    }

    public User(String userName, double leftMoney) {
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    //get/set方法
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show() {
        System.out.println("用户名" + "username" + "，余额" + leftMoney + "元");
    }
}

