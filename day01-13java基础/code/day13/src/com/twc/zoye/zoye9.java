package com.twc.zoye;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zoye9 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");
        Stream<String> streamOne = one.stream().filter(s -> s.length() == 3)
                .limit(6);
        Stream<String> streamTwo = two.stream().filter(s -> s.startsWith("张"))
                .skip(1);
        Stream<String> streamThree = Stream.concat(streamOne, streamTwo);
        streamThree.map(Student::new).forEach(System.out::println);
        List<Film> filmList = Stream.concat(streamOne, streamTwo).map(Film::new).collect(Collectors.toList());
        System.out.println(filmList);


    }
}
