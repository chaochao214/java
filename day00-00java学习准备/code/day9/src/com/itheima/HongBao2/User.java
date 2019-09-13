package com.itheima.HongBao2;

public class User {
    private String userName;
    private double leftMoney;

    public  User(){


    }
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

    public User(String userName, double leftMoney) {
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", leftMoney=" + leftMoney +
                '}';
    }
}
