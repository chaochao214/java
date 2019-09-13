package com.twc.jliy.annotationDemo;

public @interface BookAnnotation {
     String value();
     double price() default 100;
     String[ ] authors();


}
