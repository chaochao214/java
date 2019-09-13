package com.itheima.domain;

/****
 * @Author:shenkunlin
 * @Date:2019/5/22 18:09
 * @Description:
 *****/
public class AccountUser extends Account {

    private String username;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
