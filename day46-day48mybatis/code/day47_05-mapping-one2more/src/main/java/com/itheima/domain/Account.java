package com.itheima.domain;

/****
 * @Author:shenkunlin
 * @Date:2019/5/22 18:04
 * @Description:
 *****/
public class Account {
    private Integer id;
    private Double money;
    private Integer uid;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                ", uid=" + uid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
