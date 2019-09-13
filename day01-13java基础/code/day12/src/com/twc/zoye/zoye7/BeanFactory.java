package com.twc.zoye.zoye7;

@FunctionalInterface
public interface BeanFactory<T> {
    T getBean();
}
