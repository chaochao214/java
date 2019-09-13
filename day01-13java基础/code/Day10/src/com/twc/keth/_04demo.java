package com.twc.keth;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class _04demo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream( "Day10\\demo4.txt");
        System.setOut(ps);
        System.out.println("testdemo4");
    }
}
