package com.twc.zoye;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class zoye2 {
    public static void main(String[] args) {
        //1 a.
        //List<Integer> list = new ArrayList<>();
        Function<ArrayList<Integer>, Integer> f1 = (list) -> {
            Integer sum = 0;
            for (Integer i : list) {
                sum += i;

            }
            return sum/list.size();
        };
        //b.将map集合中的value存到 ArrayList<Integer> 中
        Function<Map<String,Integer>,ArrayList<Integer>> f2 = (map)->{
            Collection<Integer> values = map.values();
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(values);
            return list;
        };
        //2.将学生成绩和姓名封装到map中
        //为什么 lambda表达式只用了一个map?
        Function<Map<String,Integer>, ArrayList<Integer>> f3= (map)->{
            ArrayList<Integer>  list = new ArrayList<>();
           /* for(String s: map.keySet()){
                Integer i  = map.get(s);
                list.add(i);
            }*/
           Collection<Integer> values = map.values();
           //????搞不明白为什么会报错
          //d list.add(values);
           return list;
        };
        //2 学生成绩和姓名添加到map中
        Map<String,Integer>  map   = new HashMap<String, Integer>();
        Integer avg= f2.andThen(f1).apply(map);
        System.out.println("学生成绩"+avg);

    }
}
