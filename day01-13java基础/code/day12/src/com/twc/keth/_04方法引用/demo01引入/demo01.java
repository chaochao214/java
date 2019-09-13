package com.twc.keth._04方法引用.demo01引入;

public class demo01 {
    public static void main(String[] args) {
        /*printString(new Printable() {
            @Override
            public void print(String s) {
                System.out.println( s);
            }
        });*/
        printString(s-> System.out.println(s));
        printString(System.out::println);

    }
    public static void printString(Printable lambda){
        lambda.print("print");
    }
}
