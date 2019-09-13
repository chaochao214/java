package com.twc.Zoye;

public class Zoye8 {
    public static void main(String[] args) {
       char[]   a    ={'i','t','c','a','s','a'};
        //char[]   a    ={'i','i','i','i','i','i','i'};
        char[]   b    ={'t'};
        System.arraycopy(b,0,a,5,1);
        System.out.println(a);
        System.out.println(b);
    }
}
