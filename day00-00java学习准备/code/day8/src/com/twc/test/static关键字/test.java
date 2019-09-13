package com.twc.test.static关键字;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age =20;
        // jvm的内存结构？
        s1.room="101";
        System.out.println(Student.room);

    }
}
