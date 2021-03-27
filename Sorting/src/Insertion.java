import java.util.*;

public class Insertion {
    public static int [] insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>=1;j--){
                int pos = j;
                int prev = j-1;
                if(arr[pos]<arr[prev]){
                    int temp = arr[pos];
                    arr[pos] = arr[prev];
                    arr[prev] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));

        }
        return arr;

    }

    public static void main(String [] args){

        int [] arr = {2,8,5,3,9,4,1};
        arr = insertionSort(arr);
    }

}
