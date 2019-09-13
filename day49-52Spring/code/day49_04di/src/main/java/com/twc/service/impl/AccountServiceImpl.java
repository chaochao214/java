package com.twc.service.impl;

import com.twc.service.AccountService;

import java.util.*;

/**
 * @Author: twc
 * @Date 2019/5/25 20:29
 **/
public class AccountServiceImpl implements AccountService {
    private String name;
    private Integer age;
    private Date birthday;
    private Object[] arrays;
    private List<Object> list;
    ;
    private Set<Object> set;
    private Map<String, Object> map;
    private Properties properties;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setArrays(Object[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    public AccountServiceImpl() {
        System.out.println("accounServiceImpl的空构造器");

    }

    //构造函数注入的方式
    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }


    @Override
    public void saveAccount() {
        System.out.println("accountServiceImpl中的save方法被执行");
        System.out.println("name" + name + "age" + age + "birthdayy" + birthday + "arrays" + Arrays.toString(arrays) +
                "list" + list + "set" + set + "map" + map + " propeti:" + properties);

    }
}
