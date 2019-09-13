package com.twc.zoye.zoye7;

public class test {
    public static void main(String[] args) {
        Car Q7  = getCar(Car::new);
        Q7.setBrand("奥迪");
    }

    private static Car getCar(BeanFactory<Car> factory) {
        return  factory.getBean();
    }


}
