package com.twc.jliy.annotationDemo;

public @interface Student {
    String name();
    int age();
    String gender() default "男"; //性别
    //该注解有了三个属性 name,age,gender

}
