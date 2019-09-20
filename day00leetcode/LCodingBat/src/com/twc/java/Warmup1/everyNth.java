package com.twc.java.Warmup1;

public class everyNth {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(endUp(s));

    }

    //1.
    public static String everyNth(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                s += str.charAt(i);
            }
        }
        return s;
    }

    //end up
    public static String endUp(String str) {
        if (str.length() < 4) {
            return str.toUpperCase();
        }
        if (str.length() > 3) {
            String start = str.substring(0, str.length() - 3);
            String end = str.substring(str.length() - 3, str.length()).toUpperCase();

            str = start.concat(end);
        }
        return str;
    }

    // StringE
    public boolean stringE(String str) {
        int count = 0;
        for (char a : str.toCharArray()) {
            if ('e' == a) {
                count++;
            }
        }
        if (count > 0 || count < 4) {
            return true;
        }
        return false;
    }

    //
    public static String startOz(String str) {
        if (str == null || str == "") {
            return null;
        }
        if (str == "o") {
            return "o";
        }
        if (str == "z") {
            return "z";
        }
        return null;

    }
    //

    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            if (a > 0 && b < 0 || b > 0 && a < 0) {
                return true;
            }
            return false;
        }
        if (a < 0 || b < 0) {
            return true;
        }
        return false;
    }

    public String notString(String str) {

        if (str.startsWith("not ") || str == "not") {
            return str;
        }
        return "not " + str;

    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    public String frontBack(String str) {
        if (str.length() > 1)
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        return str;
    }

    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public String front22(String str) {
        if (str.length() == 0) return "";
        if (str.length() == 1) {
            return str + str + str;
        }
        String s = str.substring(0, 2);
        return s + str + s;
    }

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(0, 3).equals("hi")) {
            return true;
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0) {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        if (a > 10 && a < 20 || b > 10 && b < 20) {
            return true;
        }
        return false;

    }

    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    boolean isTeen(int a) {
        if (a <= 19 && a >= 13) {
            return true;
        }
        return false;
    }


    public boolean loneTeen(int a, int b) {
        if (isTeen(a) && !isTeen(b)) {
            return true;
        }
        if (!isTeen(a) && isTeen(b)) {
            return true;
        }
        return false;
    }

    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        if(str.substring(1, 4).equals("del")){
            return str.substring(0,1)+str.substring(4,str.length());
        }
        return str;
    }
    public boolean mixStart(String str) {
        if(str.length()<3){
            return false;
        }
        if(str.substring(1,3).equals("ix")){
            return true;
        }
        return  false;
    }


}