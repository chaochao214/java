package Com.zoye;

import java.awt.datatransfer.StringSelection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class zoye11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请字符");
        String  s= sc.nextLine();

        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        char[] sChar =s.toCharArray();
        for (char c : sChar) {
            lhs.add(c);
        }
        System.out.println( lhs.toString());
    }

}
