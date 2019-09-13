package com.lmxi;

public class test {
    public static void main(String[] args) {
        method(()->System.out.println("表达式调用"));

    }



    public  static void method(Inter  inter){
        inter.show();
    }
}
