package com.twc.keth._01review;

import java.util.Arrays;
import java.util.HashMap;

public class demo01 {
    public static void main(String[] args) {
        // 一个关于时间复杂度和空间复杂度的问题
        int[] arr = {4, 3, 2, 5, 6};
        int target = 10;

        System.out.println(Arrays.toString(fun(arr, target)));

    }

    // 关于代码的重构
    public static int[] fun(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int key = target - arr[i];
            if(hm.containsKey(key)){
                return new int[]{i,hm.get(key)};
            }
        }

        return  null;
    }
    }
