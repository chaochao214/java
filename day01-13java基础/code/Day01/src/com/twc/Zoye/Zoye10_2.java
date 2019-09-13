package com.twc.Zoye;

public class Zoye10_2 {
    public static void main(String[] args) {
        String[] as = {"010","3223","666","7890987","123123"};
        System.out.println(reverse(as));
    }

    public static int reverse(String[] arr) {
        int count = 0;
        for (String s : arr) {
            StringBuilder sb = new StringBuilder();
            if (sb.append(s).reverse().toString().equals(s)){
                count++;
            };

        }
        return count;
    }
}
