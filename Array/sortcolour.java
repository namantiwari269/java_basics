package Array;

public class sortcolour {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,2,2,2,1,2,0,0,0,2,2,1};
        int n = arr.length;
        int lo=0,mid=0,hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,lo,mid);
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,hi,mid);
                hi--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
