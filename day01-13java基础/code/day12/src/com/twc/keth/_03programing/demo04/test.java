package com.twc.keth._03programing.demo04;
// 自定义函数式接口作为参数和返回值。
public class test {
    public static void main(String[] args) {
        printData(()->"te");
        //??? 下面两个的输出结果？？
        printData(()->getData());
        System.out.println("_______________");
        printData(getData());
    }
    // 一个生产者模型
    public static MySupplier getData(){
        return new MySupplier() {
            @Override
            public Object get() {
                return 1;
            }
        } ;

        //lambda表达式表示
       // return ()->"返回值";
    }

    public static void  printData(MySupplier lambda){
        System.out.println(lambda.get());
    }
}
