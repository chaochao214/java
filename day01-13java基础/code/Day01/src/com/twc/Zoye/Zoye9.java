package com.twc.Zoye;

public class Zoye9 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s ="";
        for (int i = 0; i < 10000; i++) {
            s+="7";
        }
        long end= System.currentTimeMillis();
        System.out.println(end-start);

        long start2 =System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("7");
        }
        long  end2 =System.currentTimeMillis();
        System.out.println(end2 -start2);

    }
}
