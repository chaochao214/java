package com.twc.ArrayListDemo;

public class StudentTest {
    public static void main(String[] args) {

        Student[]  students = new Student[3];
        Student   s1 = new Student("曹操",20 );
        Student   s2 = new Student("李玲",22);
        Student   s3 = new Student("韩美美",27);
//对象数组
        students[0] = s1 ;
        students[1] = s2;
        students[2] = s3;
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }

}
