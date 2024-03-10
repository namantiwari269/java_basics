package Array;

import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        int[] arr = {10,23,44,667,86,34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int x = sc.nextInt();
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n= arr.length;
        x = x%n;
        reverse(arr,0 ,n-x-1);
        reverse(arr,n-x, n-1);
        reverse(arr, 0, n-1);
        
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void reverse(int[] arr, int i , int j){
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
