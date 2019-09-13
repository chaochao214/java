package com.twc.jlyi;

import java.util.function.Predicate;

public class PredicateTest2 {
    private  static  void method(Predicate<String> one,Predicate<String>  two){
        boolean  isValid = one.and(two).test("HelloWorld");
        System.out.println( " 字符串符合要求么"+isValid);
    }

    public static void main(String[] args) {
        method(s->s.contains("H"), s->s.contains("w"));
    }
}
