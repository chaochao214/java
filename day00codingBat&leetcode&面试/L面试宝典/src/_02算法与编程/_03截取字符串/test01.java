package _02算法与编程._03截取字符串;

/**
 *
 *  、编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截
 * 取的字符串，但要保证汉字不被截取半个，如“我 ABC”，4，应该截取“我 AB”，
 * 输入“我 ABC 汉 DEF”，6，应该输出“我 ABC”，而不是“我 ABC+汉的半个
 *
 */
public class test01 {
    public static void main(String[] args) {

        String str2= "我ABC";
        cutA(str2,4);
        System.out.println("----------");
        String str= "我ABC汉DEF";
        cutA(str,6);

    }
    public  static void cutA(String str,int len){
        String s= "";
      int i =  0;
      while(len>0){
           char c= str.charAt(i);
           if(len==1){
                if(isHan(c)){
                    System.out.println(s);
                    return;
                }
           }

           if(isHan(c)){
                len-=2;
                i++;
                s+=c;
           }else{
               i++;
               len--;
                s+=c;

           }
      }

        System.out.println( s);

    }

    public static boolean isHan(Character c){
     if(c>='0'&&c<='9'){
         return false;
     }else if(c>='a'&&c<='z' || c>='A'&& c<='Z'){
         return false;
     }
     return  true;
    }

}
