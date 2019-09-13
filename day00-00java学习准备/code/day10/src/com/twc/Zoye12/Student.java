package com.twc.Zoye12;

public class Student {
    String name;
    int score;
    Teacher teacher;

    public Student() {
    }

    public Student(String name, int score, Teacher teacher) {
        this.name = name;
        this.score = score;
        this.teacher = teacher;
    }
    public void  getMyResult(){
        System.out.println("我是学生" + name + "我的老师是" + teacher.getName() + "他教我" + teacher.getCourse() + "学科");
        if(score>=60){
            System.out.println("继续加油");
        }else{
            System.out.println(teacher.getName()+"让你回去罚写100遍");
        }
    }
}
