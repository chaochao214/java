package com.twc.Demo3;

import java.util.Arrays;

/*
 求众数，众数是指数组中重复数字超过1的数字

 */
public class Demo169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums.length/2;


    }
}
