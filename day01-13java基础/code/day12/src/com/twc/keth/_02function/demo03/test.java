package com.twc.keth._02function.demo03;

import com.twc.jlyi.FunctioalInterface02.Eatable;

public class test {
    public static void main(String[] args) {
        fun(()-> System.out.println("无参无返回"));
    }
    public static  void fun(Eatable lambda){
        lambda.eat();
    }

}
