package com.twc.keth._04方法引用.demo05;

public class Man extends human{
    @Override
    public void fun() {
        System.out.println("man");

    }
    public  void fun(Greetable lambda){
        lambda.greet();
    }
    public void  method(){
        //调用父类的sayhello
        fun(new Greetable() {
            @Override
            public void greet() {
                Man.super.fun();
            }
        });
        fun(new Greetable() {
            @Override
            public void greet() {
                Man.this.fun();
            }
        });
        fun(super::fun);
        fun(this::fun);


    }


}
