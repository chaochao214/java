package com.twc.fileDemo;

        import java.io.File;

public class fileDemo {
    //???输出结果总是零字节，不知道为什么
    public static void main(String[] args) {
        File f = new File("D:/java_code/test/aaa.txt" );
        System.out.println(f.delete());
        System.out.println(f.exists());
       /* System.out.println(f.length());




        File f2 =   new File("d:/java_code/test.test2.java");*/

    }
}
