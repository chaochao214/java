package com.twc.keth.toStringDemo;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    ;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // true  传统的方法设置问题
    /*@Override
    public boolean equals(Object o) {
        //如果地址值相同 ，直接返回true.健壮性判断，增强判断的效率
        if (this == o) {
            return true;
        }
        // 如果传入的参数 是null，直接返回false
        //如果字节码返回值对象不同， 直接返回false
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //向下转型
        Person person = (Person) o;
        return this.age == person.age &&
                Objects.equals(name, person.name);
    }*/


}
