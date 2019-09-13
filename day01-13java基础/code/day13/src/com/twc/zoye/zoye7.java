package com.twc.zoye;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zoye7 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("黄蓉", "穆念慈");
        Stream<String> s2 = Stream.of("黄蓉", "杨康");
        List<String> stringList = Stream.concat(s1, s2).collect(Collectors.toList());

    }
}
