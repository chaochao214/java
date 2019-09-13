package com.twc.Zoy;

import java.util.ArrayList;

public class Zoye9 {
    public static void main(String[] args) {
       Student s1 = new Student("学生一",12,"male");
       Student s2 = new Student("学生二",18,"female");
       Student s3 = new Student("学生三",21,"female");
       ArrayList<Student>  al = new ArrayList<>();
       al.add(s1);
       al.add(s2);
       al.add(s3);
       for( Student s :al){
           System.out.println(s.getName()+ s.getAge()+s.getGender());
       }
    }
}
