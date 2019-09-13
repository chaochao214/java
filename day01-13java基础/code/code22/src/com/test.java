package com;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {

        List<String> list1 = List.of("tom", "kobe", "jordan", "tracy", "westbook", "yaoming", "ace", "stephen");
        List<String> list2 = List.of("beyonce", "jay_z", "adele", "taylor", "bieber", "ladygaga");
        //1：第一个队伍只要名字长度大于4的前三名
        Stream<String> l1 =  list1.stream().filter(s->s.length()>4).limit(3);
        //2：第二个队伍只要名字中带有a的;筛选后不要第一个
        Stream<String> l2 = list2.stream().filter(s -> s.contains("a")).skip(1);
        //3：将两个队伍合并为一个队伍,并最终转换为List集合
        List<String> list3 = Stream.concat(l1, l2).collect(Collectors.toList());
        Collections.sort(list3,(o1,o2)-> o2.compareTo(o1));
        list3.stream().forEach(System.out::println);
        l1.close();
        l2.close();
    }

}
