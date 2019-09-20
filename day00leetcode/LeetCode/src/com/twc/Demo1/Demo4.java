package com.twc.Demo1;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num  = getSum( nums1, nums2);
        int len = num.length;
      // 遍历num的输出数值
        if(len%2==0){
            return (double)(num[len/2]+num[len/2 -1])/2 ;

        }else{
            return  (double)num[(len-1)/2];
        }

    }
    public int[] getSum(int[] nums1,int[] nums2){
        int len=nums1.length+nums2.length;
        int j = 0;

        int[]  num = new int[len];
        for (int i = 0; i < len; i++) {
            if(i< nums1.length){
                num[i]= nums1[i];
            }
            if(i>=nums1.length){
                //报错
                num[i]=nums2[j];
                j++;
            }
        }

        Arrays.sort(num);
        return num;

    }


}
