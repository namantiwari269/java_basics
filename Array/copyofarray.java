package Array;
import java.util.Arrays;
public class copyofarray {
    public static void main(String[] args) {
        int[] arr = {30,10,48,23,89,34};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr;//shallow copy
        nums[0]=70;
        System.out.println(arr[0]);// here arr[0] is also 
        //converted into 70 along with nums[0]
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        //deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0]=66;
        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}
