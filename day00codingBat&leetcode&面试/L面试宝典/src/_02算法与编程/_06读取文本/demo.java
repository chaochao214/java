package _02算法与编程._06读取文本;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * 从类似如下的文本文件中读取出所有的姓名，并打印出重复的姓名和重复的
 * 次数，并按重复次数排序：
 */
public class demo {
    public static void main(String[] args) throws IOException {
        sortResul( readTxt());

    }
    public static void sortResul(HashMap<String,Integer> map){
        //怎么对map进行排序

        List<Map.Entry<String,Integer>>  list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                 return  o2.getValue()-o1.getValue();
            }
        });
        //怎么对map进行排序 ??
        for (Map.Entry<String, Integer> mapping : list) {
            System.out.println(mapping.getKey()+":"+ mapping.getValue());

        }


    }
    public static HashMap<String,Integer> readTxt() throws IOException {
        //编码问题怎么解决的

        /*File file = new File("D:\\java_code\\test\\mmui_2_6.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));*/

        File file = new File("D:\\java_code\\test\\mmu_2_6.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        HashMap<String,Integer> map  = new HashMap<>();

        String s = null;
        while ((s = br.readLine()) != null) {
            String[] sp = s.split(",");
            if(!map.containsKey(sp[1])){
                map.put(sp[1],1);
            }else{
                map.put(sp[1],map.get(sp[1])+1);
            }
        }
        return  map;
    }


}
