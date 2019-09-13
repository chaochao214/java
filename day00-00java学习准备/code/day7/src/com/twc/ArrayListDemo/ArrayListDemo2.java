package com.twc.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Student> list  = new ArrayList<>();
        Student s1= new Student("田文超",18);
        Student s2= new Student("twc",22);
        Student s3= new Student("黄帆",16);
         list.add(s1);
         list.add(s2);
         list.add(s3);
       for(int i= 0;i<list.size();i++){
           Student s = list.get(i);
           System.out.println(s.getName()+"____"+ s.getAge());
       }


    }


}
