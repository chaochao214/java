package _02算法与编程._01交替合并;

import java.io.*;

/**
 *
 *
 */
public class 交替合并 {
    public static void main(String[] args) throws IOException {
       //  fileR();
    }

    static  void  concatS(StringBuilder s1,StringBuilder s2){

        int len = Math.min(s1.length(),s2.length());
        /*while (){


        }*/

    }

    static FileWriter  writeFile(StringBuilder s) throws IOException {
        File file = new File("D://java_code//test//c.txt");
        FileWriter fw = new FileWriter(file);
        return fw;
    }

    /**
     *  输入文件路径，返回String,用空格分隔
     * @param file
     * @return
     * @throws IOException
     */
    static StringBuilder  fileR(File file) throws IOException {
         //    File  file  = new File("D:\\java_code\\test\\a.txt");
        StringBuilder  sb = new StringBuilder();
        BufferedReader br= new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
          //  String[] sp = s.split(" ");

            sb.append(" "+s);
        }
        System.out.println(sb);
        return sb;
    }
}
