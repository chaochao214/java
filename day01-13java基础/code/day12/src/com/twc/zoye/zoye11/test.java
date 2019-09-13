package com.twc.zoye.zoye11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("谢霆锋", 85));
        list.add(new Student("章子怡", 63));
        list.add(new Student("刘亦菲", 77));
        list.add(new Student("黄晓明", 33));
        list.add(new Student("岑小村", 92));

        Collections.sort(list, Comparator.comparing(Student::getScore));
        System.out.println(list);

    }


}
