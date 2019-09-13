package com.twc.Zoy;
// 引用类型数组指定位置元素互换
public class Zoye11 {
    public static void main(String[] args) {

    }
    //泛型方法 zoye11
    public static <E> void reverse(E[] a,int b,int c){
            E temp = a[b];
            a[b]  = a[c];
            a[c] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    //zoye12
    public static <E> void method(E[] e ){
        int min=0; int max= e.length-1; E temp;
        for (int i = 0; min<max; max--,min++) {
           temp =  e[max];
           e[max] =e[min];
           e[min] =temp;
        }
        //?？？？？泛型的使用方法不是很熟练
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
