package com.twc.Zoye.Zoye6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String>  map = new HashMap<Integer,String>();
       // HashMap<Integer,String> map2 =new HashMap<>();

        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"李2五");
        map.put(4,"李六");

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            String value = map.get(key);
            System.out.println(key+ " ----" + value);
        }

        System.out.println(map);




    }

}
