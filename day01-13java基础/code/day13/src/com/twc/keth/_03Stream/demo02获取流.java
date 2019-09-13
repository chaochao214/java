package com.twc.keth._03Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class demo02获取流 {
    // list集合
    ArrayList<String> list =  new ArrayList<>( );
    Stream<String> stream1= list.stream();

    //set集合
    HashSet<String> hs =  new HashSet<>();
    Stream<String> s2=  hs.stream();

    //map集合
    HashMap<String,String>  map  = new HashMap<>();
    Stream s3 =  map.keySet().stream();
    Stream s4 = map.values().stream();
    Stream s5 = map.entrySet().stream();

}
