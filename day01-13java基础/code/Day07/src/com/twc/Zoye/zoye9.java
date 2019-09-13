package com.twc.Zoye;

public class zoye9 {
    /*
    在下面的代码中，请使用Lambda的省略格式调用
     invokeDirect 方法，打印输出“导演拍电影啦！”字样：

     */
    public static void main(String[] args) {
     // 调用invokeDirect方法
         invokeDirect(()-> System.out.println("拍电影"));
    }
    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
