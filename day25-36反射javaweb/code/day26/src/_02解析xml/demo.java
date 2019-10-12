package _02解析xml;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class demo {

    private Document document;
    private Element rootElement;
    @Before
    public void init(){
        //1. 将配置文件转换成流
        ClassLoader  classLoader  =  demo.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("books.xml");
        //2创建一个saxReader解析器
        SAXReader reader  =  new SAXReader();
        try{
            document = reader.read(is);
            rootElement  = document.getRootElement();

        } catch (DocumentException e) {
            e.printStackTrace();
        }finally {
             try{
                  is.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
        }
    }

    @Test
    public void test01(){
        System.out.println(rootElement.getName());
    }
    @Test
    public void test02(){
        //1.使用dom4j,获取 Book。xml 中的所有标签
        //2.
        Iterator<Element> iterator = rootElement.elementIterator();
        while(iterator.hasNext()){
            Element element = iterator.next();
            boolean textOnly  = element.isTextOnly();
            if(!textOnly){
                 Iterator<Element> iterator1 = element.elementIterator();
                 while(iterator.hasNext()){
                      Element element1 = iterator1.next();
                     System.out.println(element.getName());
                 }
            }
        }
    }






}
