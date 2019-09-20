package _02算法与编程._10排序的方法;
/**
 * 快速排序的答案
 */
public class quicksort {
    public static void main(String[] args) {
        String[] strVoid  = new String[]{"11","66","0","22","32"};
        quicksort qs = new quicksort();
        quickSort(strVoid,0,strVoid.length-1);
        for (int i = 0; i < strVoid.length; i++) {
            System.out.println(strVoid[i]+ " ");
        }
    }

    static void quickSort(String[] strDate,int left,int right){
        String  middle,tempDate;
        int i,j;
        i = left;
        j = right;
        middle  = strDate[( i+j)/2];
        do{
            while(strDate[i].compareTo(middle)<0&& i<right){
                i++;
            }
            while(strDate[j].compareTo(middle)>0&& j>left){
                j--;
            }
            if(i<=j){
                tempDate=strDate[i];
                strDate[i]=strDate[j];
                strDate[j]=tempDate;
                i++;
                j--;
            }
        }while(i<=j);

        if(i<right){
            quickSort(strDate,i,right);
        }
        if(j>right){
             quickSort(strDate,left,j);
        }
    }






}
