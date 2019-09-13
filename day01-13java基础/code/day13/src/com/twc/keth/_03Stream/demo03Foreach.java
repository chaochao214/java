package com.twc.keth._03Stream;

import java.util.function.Function;
import java.util.stream.Stream;

public class demo03Foreach {
    public static void main(String[] args) {
        Stream<String> s   = Stream.of("name1"," name2","name3","name4","name5");
       /* s.forEach(System.out::println);
        s.forEach(t-> System.out.println(t));*/

       //类型转换 。将String 类型的转换成person类型
        //s.map(s-> new Person)
        s.map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return new Person();
            }
        });
        //这里不是很能理解。
     //   s.map(t->new Person(t)).forEach(System.out::println);


    }
}
