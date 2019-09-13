package com.twc.zoye.zoye4;

@FunctionalInterface
public interface NumberSupplier {
    //可变参数
     int getNum(int...nums);
}
