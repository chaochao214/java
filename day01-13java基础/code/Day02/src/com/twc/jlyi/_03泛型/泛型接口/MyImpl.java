package com.twc.jlyi._03泛型.泛型接口;
//实现泛型接口之后也要加一个E
public class MyImpl<E> implements  MyGenericInterface<E> {


    @Override
    public void add(E e) {
        System.out.println(e);
    }

    @Override
    public E getE() {
        return null;
    }
}
