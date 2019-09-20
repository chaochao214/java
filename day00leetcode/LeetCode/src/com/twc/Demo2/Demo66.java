package com.twc.Demo2;

public class Demo66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int count = 0;
        //等于9的数字清零
        for (int i = 0; i < len; i++) {
            if (digits[len - 1 - i] != 9) {
                break;
            }
            digits[len - 1 - i] = 0;
            count++;
        }
        if (count == 0 && count>0) {
            digits[len - 1] += 1;
        }
        if (count < len) {
            digits[len - count-1] += 1;
        }
        if (count == len) {
            int[] arr = new int[len + 1];
            arr[0] = 1;
            return arr;
        }

        return digits;
    }

}
