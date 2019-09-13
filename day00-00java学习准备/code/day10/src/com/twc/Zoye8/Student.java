package com.twc.Zoye8;

public class Student implements Study {
    int name;
    double score;
    Line lin;

    public Student() {
    }

    public Student(int name, double score, Line lin) {
        this.name = name;
        this.score = score;
        this.lin = lin;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Line getLin() {
        return lin;
    }

    public void setLin(Line lin) {
        this.lin = lin;
    }

    @Override
    public void studyLine() {
        System.out.println("您报名的就业班为：zzz,应缴纳学费：sss元");
    }
    void exam(int yyy){
        if(yyy>60){
            System.out.println("您的考试成绩为"+yyy+"考试通过");
        }
        else{
            System.out.println("不及格");
        }

    }


}
