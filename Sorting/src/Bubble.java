import java.util.*;
public class Bubble {

    public static int [] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main (String [] args){
        int arr [] = {2,8,5,3,9,4,1};
        arr = bubbleSort(arr);
    }
}
