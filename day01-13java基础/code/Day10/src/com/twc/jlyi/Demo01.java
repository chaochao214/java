package com.twc.jlyi;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedInputStream bis = new BufferedInputStream((new FileInputStream("bix.txt")));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("box.txt"));

    }
}
