import java.util.*;
public class Selection {

    public static int [] selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int cursor = i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    cursor = j;
                }
            }
            int temp = arr[i];
            arr[cursor] = temp;
            arr[i] = min;
            System.out.println(Arrays.toString(arr));

        }
        return arr;
    }

    public static void main (String arg []){

        int [] arr = {2,8,5,3,9,4,1};
        arr = selectionSort(arr);
    }
}



