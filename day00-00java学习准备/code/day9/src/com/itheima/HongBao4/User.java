package com.itheima.HongBao4;

public class User {
    private String UserName;
    private double leftMoney;

    public User() {
    }

    public User(String userName, double leftMoney) {
        UserName = userName;
        this.leftMoney = leftMoney;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", leftMoney=" + leftMoney +
                '}';
    }
}
