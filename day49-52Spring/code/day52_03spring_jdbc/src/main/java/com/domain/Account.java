package com.domain;

import java.io.Serializable;

/**
 * @Author: twc
 * @Date 2019/5/30 21:22
 **/
public class Account implements Serializable {
    private Integer id;
    private String  name;
    private Float  money;

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
