package com.twc.zoye.zoye3;

public class Test {
    public static void main(String[] args) {
       /* decToHex(17, new NumberToString() {
            @Override
            public String convert(int num) {
                return Integer.toHexString(num);
            }
        });*/

        decToHex(17,num->Integer.toHexString(num));
        decToHex(17, Integer::toHexString);

    }
    static void  decToHex(int num,NumberToString  nts){

        String  s =nts.convert(num);
        System.out.println(s );
    }

}
