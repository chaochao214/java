package com.itheima.Zoye;

public class Zoye {
    public static void main(String[] args) {
       /* System.out.println(sum(1, 2));
        System.out.println(xldg(1, 1));
        printAug(3, 4);*/
        // vhiu();
        suuu();
        // System.out.println(fjhv(1,9));
        //  System.out.println(geww(22,2,3));
      //  System.out.println(blackjack(22, 25));
      //  System.out.println(sum(2,11,1));
    }

    public static int sum(int a, int b) {
        return (a + b);

    }

    public static boolean xldg(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }

    }

    public static void printAug(int m, int n) {
        for (int i = 1; i <= m; i++) {
            System.out.println("");
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
        }
    }

    public static void vhiu() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }


    }

    public static void suuu() {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                /* i=  7
                   j= 2,3,4,5,6
                 */
                if (i % j == 0 && i == j) {
                    System.out.println(i + " ");
                  //  break;
                }
            }
        }
    }

    public static int fjhv(int a, int b) {
        if (a < 2 || b < 2) {

            return 0;
        } else if (a > 8 || b > 8) {
            return 2;
        } else {

            return 1;
        }
    }

    public static boolean geww(int a, int b, int c) {
        int a1 = a % 10;
        int b1 = b % 10;
        int c1 = c % 10;
        if (a1 != b1 && b1 != c1 && a1 != c1) {
            return false;
        } else {
            return true;
        }

    }

    public static int blackjack(int a, int b) {
        int a1 = Math.abs(a - 21);
        int b1 = Math.abs(b - 21);
        if (a < 21 && b < 21) {
            if (a1 < b1) {
                return a;
            } else if (a1 > b1) {
                return b;
            } else {
                System.out.println(" 两个数值相等，都小于21");
            }
        } else if (a > 21 && b > 21) {
            return 0;
        } else if (a > b) {

            return b;
        } else {
            return a;
        }

        return 0;

    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        if (a == b && b == c) {

        } else if (a == b) {
            sum = c;
        } else if (a == c) {
            sum = b;

        } else if (b == c) {
            sum = a;
        } else {
            sum = (a + b + c);
        }
        return sum;
    }


}







