package com.twc.Demo3;

/*
 阶乘后的0；
 class Solution {
    public int trailingZeroes(int n) {
        int total = 0;
        while(n != 0) {
            n /= 5;
            total += n;
        }
        return total;
    }
}

 */
public class Demo172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >=5 ) {
            n/=5;
            count++;
        }
        return count;
    }
}



//1 2 3  4  5 6 7 8 9 10 11 12 13 14 15
     /*          5 1
                 10 2
                 15 3


      */
//每5个数字加一个零


