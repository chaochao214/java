package com.i01_singleton;

import org.junit.jupiter.api.Test;

import javax.swing.text.Element;

/**
 * @Author: twc
 * @Date 2019/5/27 14:33
 **/
enum  EnumSingleton {
     INSTANCE;
     public  void otherMethods(){
         System.out.println("something");
     }
     @Test
     public void test01(){
         //
         EnumSingleton.INSTANCE.otherMethods();
     }
}
