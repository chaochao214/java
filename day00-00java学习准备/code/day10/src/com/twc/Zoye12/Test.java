package com.twc.Zoye12;

public class Test {
    public static void main(String[] args) {
        Teacher t1 =new Teacher("丽丽老师","java");
        Student s1 = new Student("黄帆",12,t1);
        t1.teaching();
        s1.getMyResult();


    }
}
