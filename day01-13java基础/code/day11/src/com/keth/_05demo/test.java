package com.keth._05demo;

public class test {
    public static void main(String[] args) {

     printData(()-> "helloWorld");
     //printData(getData());
    }

    public static void printData(MySupplier lambda){
        System.out.println(lambda.get());
    }
}
