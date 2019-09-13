package com.twc.Zoye;

import java.util.Arrays;

public class zoye11 {
    public static void main(String[] args) {
        Student[] s = {new Student("name1", 80),
                new Student("name2", 81),
                new Student("name4", 83),
                new Student("name3", 82),
        };
       Arrays.sort(s,(s1,s2)-> s2.getScore()-s1.getScore());
        for (Student student : s) {
            System.out.println( student);
        }
    }

}
