package Array;

public class twopointerreverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
        int i=0,j=n-1;
        while(i<=j){
            // int temp=arr[i];
            // arr[i]=arr[j];
            // arr[j]=temp;
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

    }
}
