package demo.factory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2019/5/1 10:47
 **/
public class BeanFactory {
    private  static Map<String,Object> beans= new HashMap<>();
    static {
        ClassLoader classLoader = BeanFactory.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("bean.xml");
        SAXReader reader  =  new SAXReader();
        try {
            Document document = reader.read(is);
           /* List<Element> list = document.selectNodes("//bean");
*/

        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }






}
