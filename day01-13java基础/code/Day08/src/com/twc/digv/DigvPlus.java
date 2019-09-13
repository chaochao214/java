package com.twc.digv;

public class DigvPlus {
    public static void main(String[] args) {
        System.out.println(getPlus(5));
    }

    private static int getPlus(int i) {
        if( i ==1){
            return 1;
        }

        return  i*getPlus(i-1);


    }
    /**
       5  return 5*4*3 *2

    */

}
