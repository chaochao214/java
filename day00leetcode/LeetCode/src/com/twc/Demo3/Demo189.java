package com.twc.Demo3;

public class Demo189 {
    public void rotate(int[] nums, int k) {
        while(k>nums.length){
            k=k-nums.length;
        }
        if(k==0){
            return;
        }

        int[] nums2 = new int[nums.length];

        for(int i= 0;i<nums.length;i++){
            if((i+k)>nums.length-1){
            nums2[i]=nums[i+k-nums.length];
            continue;
            }
            //报错了
            nums2[i]=nums[i+k];
        }
        for (int i = 0; i < nums.length; i++) {
             nums[i]=nums2[i];
            System.out.println(nums[i]);
        }

        /*
          2  3  1

          1  2  3
           */




    }

}
