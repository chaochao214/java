package com.twc.Demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo16 {
    public static void main(String[] args) {

    }

    public static int threeSumClosest(int[] nums, int target) {


        int l = nums.length;

        int best = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    int t = nums[i] + nums[j] + nums[k];
                    if (Math.abs(t - target) < Math.abs(best - target)) {
                        best = t;
                    }
                }
            }
        }
        return best;

    }

    //17 无法解决
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return null;
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        List<String> list = new ArrayList<>();

        return null;
    }

    //20
    /*
     需要用stack来做
      保证括号 相等
      1.6个符号。对应符号个数相等
      2.保
     */
    public boolean isValid(String s) {

        return true;
    }
    //26  ????满指针，快指针
    public int removeDuplicates(int[] nums) {
       if(nums.length==0) return 0;
       int i =0;
        for (int  j = 0;  j < nums.length-1;  j++) {
            if(nums[j]!=nums[i]) {
                i++;
                nums[i] =nums[j];
            }
        }
        return i;
    }

}
