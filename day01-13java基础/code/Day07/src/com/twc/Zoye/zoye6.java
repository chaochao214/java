package com.twc.Zoye;

public class zoye6 {
    public int start = 1;
    public int end  = 99;
    public static void main(String[] args) {
//???? 写法很奇怪，为什么zoye()
        new  zoye6().method();

    }
    public void method(){
        //在此处插入代码
        Runnable a  =  ()-> {
            for(int i = start;i<end;i++) System.out.println(i);
        };
        Thread t =  new Thread(a);
        t.start();
    }



}
