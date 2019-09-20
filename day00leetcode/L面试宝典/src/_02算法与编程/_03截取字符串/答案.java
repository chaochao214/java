package _02算法与编程._03截取字符串;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截
 * 取的字符串，但要保证汉字不被截取半个，如“我 ABC”，4，应该截取“我 AB”，
 * 输入“我 ABC 汉 DEF”，6，应该输出“我 ABC”，而不是“我 ABC+汉的半个”。
 *
 */
public class 答案 {
    public static void main(String[] args) throws UnsupportedEncodingException {


       /* String s="我";
        String s2 = "test";
        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));*/

        //String str ="我a爱中华abc我爱传智def";
        String str ="我AAAA汉";
        /*int num =trimGbk(str.getBytes("GBK"),5);
        System.out.println(str.substring(0,num));*/
        //
        System.out.println(Arrays.toString(str.getBytes()));


    }
    public static int trimGbk(byte[] buf,int n){
        int num =0;
        boolean bChineseFirstHalf = false;
        for(int i= 0;i<n;i++){
            if(buf[i]<0&&!bChineseFirstHalf){
    //这里是只计算了字母的个数。
                bChineseFirstHalf = true;
            }else{
                 num++;
                bChineseFirstHalf=false;
            }

        }
        return  num;
    }



}
