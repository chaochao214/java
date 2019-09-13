package com.twc.keth._04方法引用.demo06;

public class Person {
    private String name;
    public Person(){

    }
    public Person(String name){
        this.name= name;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
