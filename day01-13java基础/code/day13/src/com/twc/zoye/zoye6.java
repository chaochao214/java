package com.twc.zoye;

import java.util.stream.Stream;

public class zoye6 {
    public static void main(String[] args) {
        //Stream 取绝对值并打印  zoye6。
        Stream<Integer> stream   = Stream.of(-1, 2,3,4,-20);
        stream.map(Math::abs).forEach(System.out::println);


    }
}
