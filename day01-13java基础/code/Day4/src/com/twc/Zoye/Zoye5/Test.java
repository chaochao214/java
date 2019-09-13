package com.twc.Zoye.Zoye5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        //创建hashMap保存汽车类对象，values是汽车价格
        HashMap<Car, Integer> hm = new HashMap<>();
        Car c1 = new Car("奥拓", "蓝色");
        Car c2 = new Car("奇瑞Qq", "黑色");
        Car c3 = new Car("铃木", "白色");

        hm.put(c1, 10000);
        hm.put(c2, 20000);
        hm.put(c3, 30000);
        //hm的遍历 hashMap的遍历
        Set<Car> keySet = hm.keySet();
        for (Car c : keySet) {
            Integer value = hm.get(c);
            System.out.println(c.getName() + "," + c.getColor() + "-" + value);
        }
        System.out.println("________");
        //entry方法遍历map
        Set<Map.Entry<Car,Integer>> entrySet  = hm.entrySet();
        for(Map.Entry<Car,Integer> entry: entrySet){
            Car key  = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName() + ", " + key.getColor()+" - " + value);

        }

    }
}
