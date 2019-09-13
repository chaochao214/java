package com.twc.zoye;

import java.util.stream.Stream;

public class zoye4 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("name1", "name2", "name3", "name4", "bame");
// String::new  难以理解
        s1.filter(t->t.endsWith("4"))
        .toArray(String[]::new);

    }
}
