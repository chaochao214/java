package com.twc;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.LinkedList;
import java.util.List;

public class demo {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document doucument =
                reader.read(demo.class.getResourceAsStream("/books.xml"));
        Element elementRoot = doucument.getRootElement();
        List<Element> list = elementRoot.elements();
       // System.out.println(list);
        for (Element element : list) {
            System.out.println(element.attributeValue("id"));
        }


    }
}
