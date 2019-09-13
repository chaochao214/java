package com.twc.test;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(new Date());

        System.out.println(new Date().toString());
        System.out.println(new Date(0L));

    }

    public boolean  test(Object  o){
        if(this == o){
            return true;
        }
        return true;
    }

}
