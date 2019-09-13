package com.twc.Demo3;

public class Demo125 {
    public boolean isPalindrome(String s) {
        String sa = "";
        //剔除非数字和字母
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'|| s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sa += s.charAt(i);
            }
        }
        System.out.println(sa);
        String sb = "";

        //倒叙取 sb
        while (sa.length() > sb.length()) {
            sb += sa.charAt(sa.length() - 1);
            sa = sa.substring(0, sa.length() - 1);

        }
        System.out.println("sa===" + sa);
        System.out.println("sb==" + sb);


        if (sa.length() == sb.length()) {
            if (sa.equalsIgnoreCase(sb)) {
                return true;
            } else {
                return false;
            }

        }
        if (sa.equalsIgnoreCase(sb.substring(0, sb.length() - 1)) ) {
            return true;
        }
        return false;
    }


}
