package _01_1java基础部分;

/**
 *   short s1 = 1; s1 = s1 + 1;有什么错? short s1 = 1; s1 += 1;有什么错?
 *
 */
public class _06short加法 {
    public static void main(String[] args) {
        short s1 = 1;
       // 类型转换错误
         //会报类型转换的错误
        s1 = (short) (s1+ 1);


        //这里不好报类型转换的错误，需要进行类型转换。
        short s2= 1;
        s2+=1;
    }
}
