package com.twc.java.Strings3;

public class _01DemoString {
    public static void main(String[] args) {

        System.out.println(withoutString("Hello there", "e"));


    }

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean t = ('a' <= str.charAt(i) && str.charAt(i) <= 'z') || ('A' <= str.charAt(i) && str.charAt(i) <= 'Z');
            if (!t && i != 0 && (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'Y' || str.charAt(i - 1) == 'Z'))
                count++;
        }
        if (str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'Y' || str.charAt(str.length() - 1) == 'Z')
            count++;
        return count;
    }

    public static String withoutString(String base, String remove) {
        /*int len=remove.length();
           for (int i = 0; i < base.length()-len; i++) {
            if(remove.equalsIgnoreCase(base.substring(i,i+len))){
            //多了一个拼接操作，复杂度加了很多
                String start =   base.substring(0,i);
                String end = base.substring(i+len,base.length());
                return start.concat(end);
            }
        }
        return base;*/
        String baseU = base.toUpperCase();
        String removeU = remove.toUpperCase();
        baseU = baseU.replace(removeU, "");

        String baseM = "";
        int count = 0;
        for (int i = 0; i < base.length(); i++) {
            if (base.charAt(i) == ' ') {
                baseM += base.charAt(i);
                count++;
            }
            //如果小写，
            if (Character.isLowerCase(base.charAt(i)) &&  count<baseU.length()&&Character.toUpperCase(base.charAt(i)) == baseU.charAt(count)) {
                baseM += base.charAt(i);
                count++;
            }
            //都是大写，数字相等
            if (Character.isUpperCase(base.charAt(i)) && count<baseU.length()&&base.charAt(i) == baseU.charAt(count)) {
                baseM += base.charAt(i);
                count++;
            }

        }

        return baseM;
    }


}
