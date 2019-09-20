package com.twc.Demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo15 {
    /**
     *  超时放弃
     * @param args
     */
    public static void main(String[] args) {
        int[] nums  = {-1, 0, 1, 2, -1, -4 };
        System.out.println(Arrays.toString(threeSum(nums).toArray()));
    }
    public  static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (0 == nums[i] + nums[j] + nums[k]) {
                        List<Integer> listN = new ArrayList<Integer>();
                        listN.add(nums[i]);
                        listN.add(nums[j]);
                        listN.add(nums[k]);
                        Collections.sort(listN);
                        if (!list.contains(listN)) {

                            list.add(listN);
                        }
                    }
                }
            }
        }

        return list;
    }

}
