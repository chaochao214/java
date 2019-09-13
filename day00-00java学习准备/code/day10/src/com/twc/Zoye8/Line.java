package com.twc.Zoye8;

public class Line {
String employmentClass;
int money;

    public Line() {
    }

    public Line(String employmentClass, int money) {
        this.employmentClass = employmentClass;
        this.money = money;
    }

    public String getEmploymentClass() {
        return employmentClass;
    }

    public void setEmploymentClass(String employmentClass) {
        this.employmentClass = employmentClass;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
