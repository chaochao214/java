package com.twc.Demo1;

public class Demo11 {
    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int maxA = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                int max2 = getArea(height,j,i);
                maxA = Math.max(maxA, max2);
            }
        }
        return maxA;
    }

    public static int getArea(int[] height,int a, int b) {
        int min = Math.min(height[a],height[b]);
        return min * (b - a);


    }

}
