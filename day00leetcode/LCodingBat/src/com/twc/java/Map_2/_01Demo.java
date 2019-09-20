package com.twc.java.Map_2;

import java.util.HashMap;
import java.util.Map;

public class _01Demo {
    public static void main(String[] args) {
        String[] strings = {"a", "bb", "a", "bb"};
        System.out.println(wordLen(strings));
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i] + 1));
            }
        }
        return map;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
                continue;
            }
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            }

        }
        return map;
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], strings[i].length());
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i].charAt(0))) {
                map.put(strings[i].substring(0, 1), strings[i]);
            }
            if (map.containsKey((strings[i].charAt(0)))) {
                map.put(strings[i].substring(0, 1), map.get(strings[i].substring(0,1)) + strings[i]);
            }
        }

        return map;
    }

    /**
     * wordAppend(["a", "b", "a"]) → "a"
     * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
     * wordAppend(["a", "", "a"]) → "a"
     *
     * @param strings
     * @return
     */
    public String wordAppend(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
           if(!map.containsKey(strings[i])){
                map.put(strings[i],1);
           }
           if(map.containsKey(strings[i])){
               map.put(strings[i],map.get(strings[i])+1);
           }
        }



         return  "";

    }
}
