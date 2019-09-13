package com.twc.jlyi.lamdaDemo2;

public class Person  {
     private int age;
     private int score;

    public Person(int age, int score) {
        this.age = age;
        this.score = score;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", score=" + score +
                '}';
    }
}
