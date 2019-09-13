package com.twc.jlyi._03泛型.泛型通配符;

import java.util.ArrayList;
import java.util.Collection;

public class 泛型上下限 {
    //这里可以帮助看源码
    public static void main(String[] args) {

        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement1(list1);
        //getElement1(list2);
        getElement1(list3);


    }
    public static void  getElement1(Collection<? extends  Number> coll){}
    public static void  getElement2(Collection<? super Number> coll){}


}
