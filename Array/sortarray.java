package Array;
import java.util.Arrays;
public class sortarray {
    public static void main(String[] args) {
        int[] arr = {30,10,48,23,89,34};
        // for each loop
        for(int x : arr){
            System.out.print(x+" ");
        }
        Arrays.sort(arr);// sorts the array in ascending order
        System.out.println();
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
