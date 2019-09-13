package com.twc.MapDemo;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //创建map对象
        HashMap<String,String> map  = new HashMap<String,String>();
        //添加元素到集合，使用map集合添加方法保存数据
        map.put("黄晓明","杨颖");
        map.put("文章","马伊琍");
        map.put("邓超","孙俪");
        System.out.println(map);
        //获取所有的键
        Set<String> keys = map.keySet();
        for(String key:keys){
            String value =map.get(key);
            System.out.println(key+"的cP是:"+ value);
        }

    }
}
