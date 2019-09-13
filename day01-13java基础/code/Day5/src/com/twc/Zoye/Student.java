package com.twc.Zoye;

public class Student {
    private String name;
    private int score;

    public Student() {
    super();
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score<0){
            throw  new Zoye8("分数不能为负数");
        }
        this.score = score;
    }


}
