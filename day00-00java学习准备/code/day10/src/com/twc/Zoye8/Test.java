package com.twc.Zoye8;

public class Test {
    public static void main(String[] args) {
        Line  lineTest = new Line();
        lineTest.setMoney(19980);
        lineTest.setEmploymentClass("黑马");
        Student stu  = new Student();
        stu.setName(1188);
        stu.setScore(88);
        stu.setLin(lineTest);
        stu.exam(111);
        stu.studyLine();


    }
}
