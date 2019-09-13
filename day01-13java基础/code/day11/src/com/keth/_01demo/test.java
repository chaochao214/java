package com.keth._01demo;

public class test {
    public static void main(String[] args) {
        //fun();
       //   fun(() -> System.out.println("可以的"));
      printSum(new Sumable(){

          @Override
          public int sum(int a, int b) {
              return a+b;
          }
      },10,20);

      printSum((a,b)->a+b,234,432);
    }

    /*public static void fun() {
        new Eatable() {
            @Override
            public void eat() {
                System.out.println("无返回值");
            }
        };
    }*/


    public static void fun(Eatable lambda) {
        lambda.eat();
    }

    public static void printSum(Sumable lambda,int a,int b){
        System.out.println(lambda.sum(a,b));
    }

}
