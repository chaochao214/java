package com.twc.test;

public interface interFaceDemo {
    abstract void test();
    default  void testDefault(){
        System.out.println("deault");
    }
}
//