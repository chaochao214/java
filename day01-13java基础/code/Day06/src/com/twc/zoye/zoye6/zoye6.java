package com.twc.zoye.zoye6;

public class zoye6  {
    public static void main(String[] args) {
        ThreadM tm  = new ThreadM();
        tm.start();
        while(true){
            System.out.println( "主线程执行++++++++");
        }
    }

}
