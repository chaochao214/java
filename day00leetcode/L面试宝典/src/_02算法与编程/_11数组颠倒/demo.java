package _02算法与编程._11数组颠倒;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
    int[] arr = {1,3,4,9,8};
    convertArr(arr);
    }
    static void convertArr(int[] arr){
        int len  = arr.length;
        int temp =0;

        for (int i = 0; i < len / 2; i++) {
            temp =arr[i];
            arr[i]= arr[len-i-1];
            arr[len-i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }


}
