package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        List<Book> list = new ArrayList<>();
        FileReader fr = new FileReader("code21\\book.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            if (arr.length == 3) {
                double price = Double.parseDouble(arr[1]);
                int num = Integer.parseInt(arr[2]);
                Book b = new Book(arr[0], price, num);
                list.add(b);
            }
        }
        br.close();
        fr.close();
        //  遍历输出
        double sum =0;
        for (Book book : list) {
            double sumSub = book.getNum()* book.getPrice();
            System.out.println( book.getName()+"的总价是"+ sumSub);
            sum+= sumSub;
        }
        System.out.println("所有书的总价是"+ sum);
    }
}
