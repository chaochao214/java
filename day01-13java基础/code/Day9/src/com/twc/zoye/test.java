package com.twc.zoye;

public class test {
    public static void main(String[] args) {
         String s =" abc-def";
         String[] s2 = s.split( "-");
         System.out.println( s2[0]);
         System.out.println(s2[1]);
         Student s1= new Student("1","2","3","4");
        System.out.println(s1);
    }
}
