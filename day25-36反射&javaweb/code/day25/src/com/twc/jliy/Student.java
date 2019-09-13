package com.twc.jliy;

public class Student {
    private String name;
    public String gender;
    private int age;

    public Student(String name, String gender, int age) {
        System.out.println("public 修饰有参构造方法");
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
        System.out.println("sutdent 午餐构造方法");
    }

    private Student(String name, String gender) {
        System.out.println("private 修饰构造方法");
        this.name =name;
        this.gender =gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //普通方法
    public void  sleep(){
        System.out.println( "睡觉");
    }
    public void sleep(int hour){
        System.out.println("睡了"+hour+"小时");
    }
    public void eat(){
        System.out.println( "private修饰---eat方法");
    }
    //静态方法
    public static void study(){
        System.out.println("静态方法--好好学习java");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
