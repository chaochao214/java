package com.twc;

import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends  ClassLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try{
          String fileName = name.substring(name.lastIndexOf(".")+1)+ ".class";
          InputStream  is =getClass().getResourceAsStream(fileName);
          if(is==null){
              return super.loadClass(name);
          }
          else{
              byte[] b   = new  byte[is.available()];
              is.read(b);
              return defineClass(name,b,0,b.length);
          }
        }catch (IOException e){

        }

        return super.loadClass(name);



    }

}
