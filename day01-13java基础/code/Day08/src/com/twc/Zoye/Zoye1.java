package com.twc.Zoye;

        import java.io.File;
        import java.io.IOException;

public class Zoye1 {
    public static void main(String[] args) throws IOException {
        File a = new File("d:/java_code");
        if(!a.exists()){
            System.out.println(a.createNewFile());
        }
        File b = new File("d:/java_code/test/test/test");
        b.mkdir();
        b.mkdirs();
    }
}
