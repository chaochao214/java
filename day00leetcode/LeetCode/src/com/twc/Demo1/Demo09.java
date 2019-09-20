package com.twc.Demo1;

/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:

输入: 121
输出: true
示例 2:

输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 */
public class Demo09 {
    public boolean isPalindrome(int x) {
        if(x ==0 ){
            return true;
        }
        if (x < 0 ) {
            return false;
        }
        if (x > 0 ) {
            int len = getLength(x);
            int[] a = new int[len];
            int num = 0;
            int y = x;
            for (int i = 0; i < len; i++) {
                a[i] = y % 10;
                y = y / 10;
                System.out.println("a["+i+"]的值"+ a[i]);
            }


            for (int i = 0; i < len; i++) {
                num += a[i] * Math.pow(10, len - 1-i);
            }
            System.out.println(num);
            if (num == x) {
                return true;
            }

        }

        return false;

    }

    //X>0的时候输出x的长度
    public int getLength(int x) {
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count++;
        }

        return count;
    }
}
