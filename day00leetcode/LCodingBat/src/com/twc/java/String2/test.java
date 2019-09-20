package com.twc.java.String2;

import java.util.ArrayList;

//
public class test {
    public static void main(String[] args) {

       // System.out.println(mixString("Hi", "There"));
        System.out.println(repeatFront("xyz",3));
    }

    public String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s += str.charAt(i);
            s += str.charAt(i);
        }
        return s;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h') {
                if (str.charAt(i + 1) == 'i') {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int catN = 0;
        int dogN = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catN++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogN++;
            }
        }
        if (catN == dogN) {
            return true;
        }
        return false;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c') {
                if (str.charAt(i + 1) == 'o') {
                    if (str.charAt(i + 3) == 'e') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
        if (s1.length() < s2.length()) {
            if (s2.endsWith(s1)) {
                return true;
            }
        }
        if (s1.length() >= s2.length()) {
            if (s1.endsWith(s2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean xyzThere(String str) {
        String s = str.replace(".xyz", "a");
        if (s.contains("xyz")) {
            return true;
        }
        return false;
    }

    /**
     * @param str
     * @return Return true if the given string contains a "bob" string, but where the middle 'o' char
     * can be any char.
     * <p>
     * <p>
     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     * String->replaceall 和 replacede的区别
     * replaceAll 可以用通配符
     */
    public boolean bobThere(String str) {
        String s = str.replaceAll("b.b", "1");
        return s.equals(str);

    }

    public boolean xyBalance(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                flag = false;
            }
            if (str.charAt(i) == 'y') {
                flag = true;
            }
        }
        return flag;
    }

    public static String mixString(String a, String b) {
        int len = Math.max(a.length(), b.length());
        String s = "";
        for (int i = 0; i < len; i++) {
            if (i < a.length() && i < b.length()) {
                s = s + a.charAt(i) + b.charAt(i);
                continue;
            }
            if (i == a.length() && i == b.length()) {
                return s;
            }
            if (i >= a.length() && i < b.length()) {
                s += b.charAt(i);
            }
            if (i < a.length() && i >= b.length()) {
                s += a.charAt(i);
            }
        }
        return s;
    }

    public String repeatEnd(String str, int n) {
        String s = str.substring(str.length() - n, str.length());
        String s2 = "";
        for (int i = 0; i < n; i++) {
            s2 += s;

        }
        return s2;
    }

    
    public static String repeatFront(String str, int n) {

        String s= str.substring(0,n);
        String s2= "";
        for (int i = n; i >0; i--) {
             s2+= s.substring(0,i);
        }
        return s2;
    }
    // 可以用递归么？
    public String repeatSeparator(String word, String sep, int count) {
         String s = word;
         if(count==1){
              return s;
         }
         while(count>1){
             s += sep+word;
             count--;
         }
         return  s;
    }
    public boolean prefixAgain(String str, int n) {
        String s = str.substring(0,n);
        String s2= str.substring(n,str.length());
        return s2.contains(s);
    }
//不懂题目
    public boolean xyzMiddle(String str) {
        String[] arr = str.split("xyz");
        if(arr.length==2){
            return arr[0].length()== arr[1].length();
        }
        return false;
    }
    public String getSandwich(String str) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < str.length()-5; i+=5) {
            String  sub = str.substring(i, i + 5);
            if(str.equals("bread")){
                ar.add(i);
            }
        }
        if(ar.size()<2){
            return "";
        }
        return str.substring(ar.get(0)+5,ar.get(ar.size()-1));
    }
    public String getSandwich2(String str) {
        String[] arr = str.split("bread");
        String s = "";
        if(arr.length< 3 ){
            return s;
        }

        for (int i = 1; i < arr.length-1; i++) {
            if(i==1 || i== arr.length-1){
                 s+= arr[i];
                 continue;
            }
            s+="bread"+ arr[i];

        }
        return  s;
    }

    public boolean sameStarChar(String str) {
        for (int i =  1; i < str.length()-1; i++) {
            if(str.charAt(i)=='*'){
                 if(str.charAt(i-1)!=str.charAt(i+1)){
                     return false;
                 }
            }
        }
        return true;
    }
    /*public String oneTwo(String str) {
        for (int  i = 0;  i < str.length()-3;  i+=3) {

        }
    }*/
}
