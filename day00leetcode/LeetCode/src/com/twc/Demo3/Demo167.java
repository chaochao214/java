package com.twc.Demo3;

public class Demo167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i+1;  j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target ){
                    int[] a = {i + 1, j + 1};
                    return a;
                }
            }
        }
        return null;
    }

}
