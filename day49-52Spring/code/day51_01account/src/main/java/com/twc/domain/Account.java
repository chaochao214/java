package com.twc.domain;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.Serializable;

/**
 * @Author: twc
 * @Date 2019/5/29 19:43
 **/
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Float money;

    public Account() {
    }

    public Integer getId() {
        return id;
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

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
