package com.twc.java.Array_1;

public class Test {

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    // 怎么定义一个空数组
    public boolean sameFirstLast(int[] nums) {
        int[] num1 = {};
        if (nums.length == 0) {
            return false;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    //
    public int[] makePi() {
        int[] a = {3, 1, 4};
        return a;

    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[a.length - 1] == b[b.length - 1] || a[0] == b[0];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};

    }
}