package com.twc.ClassDemo;

public class Person {
    private  boolean  live =true;

    public void setLive(boolean live){
        this.live = live;
    }
    public boolean isLive(){
        return  live;
    }


    class Heart{
    public void jump(){
        if(live){
            System.out.println("心脏跳动");
        }else{

            System.out.println("心脏停止跳动");
        }
    }
    }



}
