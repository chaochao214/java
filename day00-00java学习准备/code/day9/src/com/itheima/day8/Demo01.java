package com.itheima.day8;

public class Demo01 {
    public static void main(String[] args) {
        String s  = "qaqq";
        char[] a = s.toCharArray();
        System.out.println(a[1]);

        String s1 = s.toUpperCase();
        System.out.println(s1);
        String[] aas = s.split("a");
        for(int i = 0;i< aas.length;i++){
            System.out.println("aas==="+aas[i]);
        }

    }



    /*




     */

}
