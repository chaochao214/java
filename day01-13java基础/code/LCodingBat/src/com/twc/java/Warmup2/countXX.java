package com.twc.java.Warmup2;

public class countXX {
    public static void main(String[] args) {

    }

    public static int countXXXtest(String str) {
        int count = 0;
        //报错，暂时无法解决。
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("XX")) {
                count++;
            }
        }
        return count;
    }


    boolean doubleX(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) != 'x') {
                return false;
            }
            if (s.substring(i, i + 2).equals("xx")) {
                return true;
            }
        }
        return false;

    }


    public String stringSplosion(String str) {
        int len = str.length();
        String s = "";
        while (len > 0) {
            s = str.substring(0, len) + s;
            len--;
        }
        return s;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean array123(int[] nums) {
        for (int i : nums) {
            return containNUm(i);
        }
        return false;
    }

    boolean containNUm(int a) {
        if (a == 1 || a == 2 || a == 3) {
            return true;
        }
        return false;
    }

    //没看懂题目的意思
  /*  public int stringMatch(String a, String b) {



    }*/
    public String stringX(String str) {
        if (str.length() <= 3) {
            return str;
        }
        String s = "";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                s += s.charAt(i);
            }
        }
        return s.charAt(0) + s + s.charAt(s.length() - 1);
    }


   /* public int stringMatch(String a, String b) {

    }*/
    // ??? 为什么报错

    public String altPairs(String str) {

        int len = str.length();
        String s = "";
        for (int i = 0; i < len-1; i += 4) {
            s =s+ s.charAt(i) + s.charAt(i + 1);
        }
        return s;
    }



    public String stringYak(String str) {
        int len = str.length();
        String s= "";
        for (int i = 0; i < len-2; i++) {
            String a= str.substring(i,i+4);
            if(!a.equals("yak")){
                s+=str.charAt(i);
            }
        }
        return s;
    }


    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
             if(nums[i]==6){
                 if(nums[i+1]==6){
                      count++;
                 }
             }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        if(nums.length<3){
            return true;
        }
        for (int  i = 0;  i < nums.length-2;  i++) {
            if(nums[i]==nums[i+1]&& nums[i]==nums[i+2]){
                return  false;
            }
        }
        return true;
    }


    public boolean has271(int[] nums) {
        for (int  i = 0;  i < nums.length-2;  i++) {
            if(nums[i +1]== nums[i]+5){
                if(nums[i+2] == nums[i]-1){
                    return true;
                }
            }
        }
        return  false;
    }
}
