package demo.utils;

import org.w3c.dom.html.HTMLTableCaptionElement;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: twc
 * @Date 2019/4/25 8:48
 **/
public class CookieUtil {

    /**
     *  创建一个cookie对象
     */
    public static Cookie createCookie(String name,String value,
                                      int time,String path){
         Cookie cookie =  new Cookie(name,value);
         cookie.setMaxAge(time);
         cookie.setPath(path);
         return cookie;
    }

    public static String getCookieValue(HttpServletRequest request,
                                        String name){
         Cookie[] cookies = request.getCookies();
         String  value  = null;
         if(cookies!=null){
             for (Cookie cookie : cookies) {
                 String name1 = cookie.getName();
                 if(name.equals(name1)){
                    value = cookie.getValue();
                 }

             }
         }
         return value;
    }

}
