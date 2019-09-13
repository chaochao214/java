package com.twc.jlyi.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class DemoTest {
    public static void main(String[] args) {
      // ？不写构造器肯定会报错
        Person[] array = {new Person("古丽扎纳", 19),
                new Person("马尔扎哈", 18), new Person("李白", 200)};

       /* Comparator<Person> comp  = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getAge()- o2.getAge();
            }
        };
        Arrays.sort(array,comp);*/
    }
}
