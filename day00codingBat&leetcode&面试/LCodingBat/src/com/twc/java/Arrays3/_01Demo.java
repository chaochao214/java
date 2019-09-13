package com.twc.java.Arrays3;

public class _01Demo {
    public static void main(String[] args) {

    }
    public int maxSpan(int[] nums) {
        if(nums.length ==0) return 0;
        int maxS = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                 if(nums[j]== nums[i]) maxS = maxS>(i-j+1)?maxS:(i-j+1) ;
            }
        }
        return maxS;
    }
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]==3&&nums[i]==4) {
                    int temp = nums[i];
                    nums[i] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]==4&&nums[i]==5) {
                    int temp = nums[i];
                    nums[i] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
