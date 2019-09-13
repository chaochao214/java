package com.twc.keth._03Stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo10存入数组或集合 {
    public static void main(String[] args) {
         // 存入集合
        List<Integer> list = Stream.of(1,2,3,4,5).collect(Collectors.toList());
        Set<Integer> set = Stream.of(1,2,3,4,5).collect(Collectors.toSet());
        Object[]  objects=Stream.of(1,2,3,4,5).toArray();

    }
}
