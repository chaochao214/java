package com.twc.keth;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class _01demo01 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw  = new BufferedWriter(new FileWriter("Day10\\demo1.txt"));
        bw.write("你好");
        bw.write("不要");
        bw.close();
    }
}
