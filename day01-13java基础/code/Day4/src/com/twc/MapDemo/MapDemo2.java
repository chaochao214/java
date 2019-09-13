package com.twc.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //创建map类集合对象
        HashMap<String,String> map = new HashMap<String,String>();
        //添加元素到集合
        map.put("胡歌","霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");
        // map.entry
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> entry :entrySet){
            //解析
            String key  = entry.getKey();
            String value  = entry.getValue();
            System.out.println(key+"的cp是"+value);
        }
    }
}
