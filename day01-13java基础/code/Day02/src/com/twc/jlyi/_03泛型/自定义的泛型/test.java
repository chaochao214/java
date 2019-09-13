package com.twc.jlyi._03泛型.自定义的泛型;

public class test {
    public static void main(String[] args) {
        MyGenetic<String>  my  = new MyGenetic<>();
        my.setMvp("setMvp");
        String s = my.getMvp();
        System.out.println(s);
    }
}
