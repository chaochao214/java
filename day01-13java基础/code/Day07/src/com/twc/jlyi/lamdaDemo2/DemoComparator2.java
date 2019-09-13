package com.twc.jlyi.lamdaDemo2;

import java.util.Arrays;

public class DemoComparator2 {
    public static void main(String[] args) {
        Person[]  pArray  = {new Person(1,4),new Person(1,2), new Person(1,3)};
        Arrays.sort(pArray,(Person a,Person b)->{return a.getAge()-b.getAge();});
        for (Person person : pArray) {
            System.out.println(person);
        }
    }
}
