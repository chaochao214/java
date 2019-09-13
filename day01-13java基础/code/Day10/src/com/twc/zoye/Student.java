package com.twc.zoye;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String age;
    private String gender;
    private String sex;

    public Student() {
    }

    public Student(String name, String age, String gender, String sex) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
