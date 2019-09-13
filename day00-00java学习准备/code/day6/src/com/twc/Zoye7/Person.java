package com.twc.Zoye7;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    ;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    public void call() {

        System.out.println("可以打电话了");
    }

    public void sendMessage() {
        System.out.println("可以发信息");
    }

    public void playGame() {
        System.out.println("可以玩游戏");
    }

}
