package _02算法与编程._04统计字符;

import java.util.HashMap;
import java.util.Map;

/**
 * 4、有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出
 * 各个字符的个数
 */

public class demo {
    public static void main(String[] args) {
        String str = "我是是是eenglish11123";
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"=="+ entry.getValue());
        }
    }

}