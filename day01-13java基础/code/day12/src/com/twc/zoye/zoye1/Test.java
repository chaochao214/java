package com.twc.zoye.zoye1;

public class Test {
    public static void main(String[] args) {

        showLongTime(new TimePrinter() {
            @Override
            public void printCurrentTime() {
                System.out.println( "打印时间");
            }
        });


        showLongTime(()-> System.out.println("打印 "));
    }
    static void  showLongTime(TimePrinter timePrinter){
        timePrinter.printCurrentTime();
    }
}
