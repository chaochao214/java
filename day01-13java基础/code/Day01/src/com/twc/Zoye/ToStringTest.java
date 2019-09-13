package com.twc.Zoye;
// ？？？？奇怪的执行顺序。

public class ToStringTest {
    static int i = 1;
    public static void main(String args[]) {
        //TOStringTest的toString方法被重写，所以返回值是 java
        System.out.println("love " + new ToStringTest());//love    java
        ToStringTest a = new ToStringTest();
        i++;
        System.out.println("me " + i);//me 2
    }
    @Override
    public String toString() {
        System.out.print("I ");//I
        return "java ";
    }
}
