package com.twc.jliy.beanUtils;

import java.util.Arrays;

public class Student {
    private String name;
    private String gender;
    private int age;
    private  String[] hobby;

    public Student(String name, String gender, int age, String[] hobby) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hobby = hobby;
    }

    public Student() {
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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
