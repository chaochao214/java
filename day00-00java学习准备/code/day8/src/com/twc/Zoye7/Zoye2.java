package com.twc.Zoye7;
/*

,定义一个方法,接收一个字符串,如果字符串中含有"bad" 并且"bad"在字符串出现的位置在0或1索引处，则返回true，
例如“badxxx”或“xbadxx”，返回true,而“xxbadxx”返回false, 字符串可以是任何长度,有可能长度为0.
注意：使用.equals（）来比较2个字符串。
 */
public class Zoye2 {
    public  boolean test(String s){
        int b = s.indexOf("bad");
        if(b==0 || b==1){
            return true ;

        }
        else{
            return false;
        }


    }

}
