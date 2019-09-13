package com.itheima.HongBao3;

public class User {
    String userName;
    double leftMoney;
    public User(){

    }
    public User(String userName,double leftMoney){
        this.userName = userName;
        this.leftMoney = leftMoney;    }


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

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", leftMoney=" + leftMoney +
                '}';
    }
}
