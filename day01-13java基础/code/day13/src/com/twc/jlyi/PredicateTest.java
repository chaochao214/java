package com.twc.jlyi;

import java.util.function.Predicate;

public class PredicateTest {
    public static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.test("HelloWorld");
        System.out.println(" 字符串很长么：" + veryLong);
    }

    public static void main(String[] args) {
        method(s -> s.length() > 5);
    }
}

