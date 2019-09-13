package com.twc.keth._04方法引用.demo06;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        printPerson(name->new Person(name));
        printPerson(Person::new);

    }
    // 这里不是特别明白
    public static void printArray( ArrayBuilder lambda){
        int[] arr = lambda.buildArray(3);
        arr[0] = 99;
        System.out.println(Arrays.toString(arr));
    }
    public static  void printPerson(PersonBuilder lambda){
        Person person = lambda.buildPerson("古力娜扎");
        System.out.println(person);
    }




}




