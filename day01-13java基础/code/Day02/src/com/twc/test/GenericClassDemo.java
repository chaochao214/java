package com.twc.test;

public class GenericClassDemo {
    public static void main(String[] args) {
        GenericDemo<String> my  = new GenericDemo<String>();
        //调用setmvp
        my.setMvp("溜溜球");
        String mvp =  my.getMvp();
        System.out.println(mvp);


    }
}
