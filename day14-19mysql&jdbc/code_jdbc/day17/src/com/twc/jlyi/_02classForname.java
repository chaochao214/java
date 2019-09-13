package com.twc.jlyi;

public class _02classForname {
    static {
        System.out.println("test");
    }


    //class.forname
    public static void main(String[] args) throws ClassNotFoundException {
         Class.forName("com.twc.jlyi._02classForname");
    }




}
