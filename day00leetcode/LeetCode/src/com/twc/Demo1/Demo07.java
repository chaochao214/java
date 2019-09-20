package com.twc.Demo1;

public class Demo07 {
    public int reverse(int x) {
        int len = getLength(x);
        int[] r = new int[len];
        int num = 0;
        if (x == 0) {
            return 0;
        }
        //x> 0的情况
        if (x > 0) {
            for (int i = 0; i < len; i++) {

                r[i] = x % 10;
                x = x / 10;
            }
            for (int i = 0; i < len; i++) {

                num += r[i] * Math.pow(10, len - i - 1);
            }
            if (num >= 2147483647 || num <=-2147483648) {
                return 0;
            } else {
                return num;
            }
        }
        // x<0的情况
        if (x < 0) {
            for (int i = 0; i < len; i++) {

                r[i] = x % 10;
                x = x / 10;
            }
            for (int i = 0; i < len; i++) {

                num += r[i] * Math.pow(10, len - i - 1);
            }
            if (num >= 2147483647 || num <= -2147483648) {
                return 0;
            } else {
                return num;
            }
        }
        return 0;
    }
        public int getLength(int x){
            int count = 0;
            if (x == 0) {
                return 0;
            }
            if (x > 0) {
                while (x > 0) {
                    x = x / 10;
                    count++;
                }
            } else {
                while (x < 0) {
                    x = x / 10;
                    count++;
                }
            }
            return count;

        }
    }