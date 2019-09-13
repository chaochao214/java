package com.twc;
/*
  通过一个数字判断是哪一个运算，
  定义两个变量，进行计算

 */
public class CalculatorDemo {
    public static void main(String[] args) {
        int i =3 ;
        int a = 100 ;
        int b = 15;
        switch(i){
            case 1:
            {
                System.out.println(sum(a,b));
            };
            break;

            case 2:
            {
                System.out.println(  dec(a ,b));
            };
            break;
            case 3:
            {
                System.out.println(plus(a,b));
            };
            break;
            case 4:
            {
                System.out.println(chu(a,b));

            };
            break;
            case 5:
            {
                System.out.println(shang(a,b));
            };
            break;
            default:
            {
                System.out.println("不支持的运算类型");
            }
            break;
        }


    }
    public static int sum(int a ,int b){
        return a +b ;
    }
    public static int dec(int a ,int b){
        return a -b ;
    }
    public static int  plus(int a ,int b){
        return a*b;
    }
    public static  int  chu(int a ,int b){
        return a/b;
    }
    public static int  shang(int a ,int b){
        return a%b;
    }
}
