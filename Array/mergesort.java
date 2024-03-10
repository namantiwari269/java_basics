package Array;

public class mergesort {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 =  {2,5,6};
        int n = 3;
        int m = 3;
        int[] nums = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                nums[k]=arr1[i];
                i++;
                k++;
            }
            else{
                nums[k]=arr2[j];
                j++;
                k++;

            }
        }
        if(i==n){
            while(j<m){
                nums[k]=arr2[j];
                k++;
                j++;
            }
        }
        else{
            while(i<n){
                nums[k]=arr1[i];
                k++;
                i++;
            }
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }    
    }
}
