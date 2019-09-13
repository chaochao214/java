package com.twc.systemDemo;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] src  = new int[]{1,2,3,4,5};
        int[] dest  = new int[]{6,7,8,9,10};
        System.arraycopy(src,0,dest,0, 5);
        for(int i :dest){
            System.out.println(i);
        }
    }
}
