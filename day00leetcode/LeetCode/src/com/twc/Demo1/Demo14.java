package com.twc.Demo1;

/*

编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 。

在真实的面试中遇到过这道题？

class Solution {
    public String longestCommonPrefix(String[] strs) {
     if (strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        if (strs.length>1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length()<=i ||strs[j].charAt(i) != curr) {
                        return sb.toString();
                    }
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {
                        sb.append(curr);
                    }
                }
            }
        }
       return sb.toString();
    }
}



 */
public class Demo14 {

    public String longestCommmonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1 || strs.length == 0) {
            return strs[0];
        }

        int count = 0;
        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            char curr = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {

                // if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                if (strs[j].length() <= i || strs[j].charAt(i) != curr) {
                    System.out.println("返回1");

                    return strs[0].substring(0, count);
                }
                // left leave leaf
            }
            count++;
        }
        System.out.println("返回2");
        return strs[0].substring(0, count);
    }


}
