package com.twc.jlyi.lambdaDemo;

public class Person {
    //private
    private String name;
    private int  age;
    // 省略构造器 toString方法， 与getter Setter


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
