package com.twc.java.String1;

public class test {



    public String makeTags(String tag, String word) {
        return "<"+ tag+ ">"+word + "</"+ tag+ ">";
    }
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+ out.substring(2,4);
    }
    public String extraEnd(String str) {
        String end = str.substring(str.length()-2,str.length());
        return  end+end +end;
    }
    public String firstTwo(String str) {
        if(str.length()<2){
            return str;
        }
        String end = str.substring(0,2);
        return  end;
    }
    public String firstHalf(String str) {
        return  str.substring(0,str.length()/2 -1);
    }
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
    public String comboString(String a, String b) {
        if(a.length()<b.length()){
            return a+b+ a;
        }
        return b+a+b;
    }
}
