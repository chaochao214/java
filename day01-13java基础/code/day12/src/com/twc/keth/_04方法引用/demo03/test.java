package com.twc.keth._04方法引用.demo03;

public class test {
    public static void main(String[] args) {
        //方法引用的问题。
        // 这里为什么不报错？
        printS(new printUpper()::printUpper);
    }
    public static void printS(Printable lambda){
        lambda.print("hello");

}



}
