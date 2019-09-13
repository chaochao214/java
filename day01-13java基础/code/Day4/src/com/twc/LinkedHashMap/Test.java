package com.twc.LinkedHashMap;

import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("邓超", "孙俪");
        map.put("刘德华", "朱丽倩");
        map.put("李晨", "范冰冰");
        System.out.println(map);
    }
}
