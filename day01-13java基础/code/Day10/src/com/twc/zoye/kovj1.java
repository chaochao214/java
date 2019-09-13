package com.twc.zoye;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class kovj1 {
    public static void main(String[] args) throws Exception {

        in();
    }
    public static void out() throws Exception{
        Student stu1 = new Student("name1", "age1", "sex1", "1");
        Student stu2 = new Student("name2", "age2", "sex2", "2");
        Student stu3 = new Student("name3", "age3", "sex3", "3");
        ArrayList<Student> al = new ArrayList<>();
        al.add(stu1);
        al.add(stu2);
        al.add(stu3);
        //对象输出流
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("Day10\\kovj1.txt"));
        oos.writeObject(al);
        oos.close();
    }
    public static void in() throws Exception{
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("Day10\\kovj1.txt"));
        ArrayList<Student> al = (ArrayList<Student>) ois.readObject();
        for (Student student : al) {
            System.out.println( student);
        }


    }

}
