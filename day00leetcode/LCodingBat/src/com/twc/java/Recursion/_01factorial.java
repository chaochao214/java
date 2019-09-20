package com.twc.java.Recursion;

public class _01factorial {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.substring(1, 3));

    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);

    }

    public static int bunnyEar(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEar(bunnies - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies - 1);
        if (bunnies % 2 == 1) return 2 + bunnyEars2(bunnies - 1);
        return -1;
    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public static int sumDigits(int n) {
        if (n == 0) return 0;
        int a = n % 10;
        int b = sumDigits(n / 10);
        int sum = a + b;
        return sum;
    }

    public int count7(int n) {
        if (n == 0) return 0;
        if (n % 10 == 7) return 1 + count7(n / 10);
        if (n % 10 != 7) return count7(n / 10);
        return -1;

    }

    public int countX(String str) {
        if (str == null || str == "") return 0;
        if (str.length() == 1) {
            if (str.charAt(0) == 'x') return 1;
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return 1 + countX(str.substring(0, str.length() - 1));
        }
        if (str.charAt(str.length() - 1) != 'x') {
            return countX(str.substring(0, str.length() - 1));
        }
        return -1;
    }

    public String changePi(String str) {
        if (str == null || str == "" || str.length() == 1) return "";

        if (str.substring(str.length() - 2, str.length()).equals("pi")) {
            return changePi(str.substring(0, str.length() - 2)) + "3.14";
        } else {
            return str.substring(0, str.length() - 1);
        }
    }

    public int count8(int n) {
        if (n == 0) return 0;
        if (n % 10 == 8 && n % 100 == 88) return 2 + count8(n / 10);
        if (n % 10 == 8 && n % 100 != 88) return 1 + count8(n / 10);

        if (n % 10 != 8) return count8(n / 10);
        return -1;
    }

    public int powerN(int base, int n) {
        if (n == 1) return base;
        return base * powerN(base, n - 1);
    }

    public int countHi(String str) {
        if (str.length() == 1) return 0;
        if (str.length() == 2) {
            if (str.equals("hi")) return 1;
            return 0;
        }
        if (str.length() > 2) {
            if (str.substring(str.length() - 2, str.length()).equals("hi"))
                return 1 + countHi(str.substring(0, str.length() - 1));
            return countHi(str.substring(0, str.length() - 1));
        }
        return -1;
    }


}


