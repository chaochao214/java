package com.twc.java.Recursion_2;

public class _01Demo {
    public static void main(String[] args) {
        int[] nums={2,4,8};
        groupSum(0,nums,10);
    }
    public static boolean groupSum(int start, int[] nums, int target) {

        if(start >=nums.length) return target == 0;
        if(groupSum(start+1,nums,target-nums[start]))return true;
        if(groupSum(start+1,nums,target))  return true;
        return false;

    }
   /* public boolean groupSum2(int start,int[] nums,int target){
        if (start>)
    }*/
   //???递归问题不能理解
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start  >= nums.length)  return  target==0;
        return true;
    }
}
