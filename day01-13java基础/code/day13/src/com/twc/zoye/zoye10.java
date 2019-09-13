package com.twc.zoye;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zoye10 {
    public static void main(String[] args) {
        ArrayList<String> global = new ArrayList<>();
        global.add("《教父》");
        global.add("《肖申克的救赎》");
        global.add("《辛德勒的名单》");
        global.add("《公民凯恩》");
        global.add("《卡萨布兰卡》");
        global.add("《教父续集》");
        global.add("《七武士》");
        global.add("《星球大战》");
        global.add("《美国美人》");
        global.add("《飞跃疯人院》");
        ArrayList<String> china = new ArrayList<>();
        china.add("《霸王别姬》");
        china.add("《大闹天宫》");
        china.add("《鬼子来了》");
        china.add("《大话西游》");
        china.add("《活着》");
        china.add("《饮食男女》");
        china.add("《无间道》");
        china.add("《天书奇谭》");
        global.stream().limit(3).forEach(System.out::println);
        china.stream().skip(china.size()-5).forEach(System.out::println);
        Stream<String> l1 = global.stream().limit(5);
        Stream<String> l2 = china.stream().limit(5);
        List<String> list = Stream.concat(l1, l2).collect(Collectors.toList());
        System.out.println( "------");
        System.out.println(list);



    }
}
