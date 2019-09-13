package com.twc.jlyi.lamdaDemo2;

import java.util.Arrays;
import java.util.Comparator;

public class DemoComparator {
    public static void main(String[] args) {
        Person[]  pArray  = {new Person(1,4),new Person(1,2), new Person(1,3)};
        Comparator<Person> com = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(0!=(p1.getAge()-p2.getAge())){
                    return  p1.getAge()-p2.getAge();
                }else{
                    return p1.getScore()-p2.getScore();
                }
            }
        };
        Arrays.sort(pArray,com);
        for(Person p:pArray){
            System.out.println(p);
        }
    }
}
