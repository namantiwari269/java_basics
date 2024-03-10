package Array;

import Conditionals.greatest;

public class nextgreatestelement {
    public static void main(String[] args) {
        int[] arr= {12,8,41,37,2,49,16,28,21};
        int[] ans = new int[arr.length];
        int i = 0;
        int n = arr.length;
        while(i<arr.length-1){
            int greatest=arr[i+1];
            for(int j=i+1;j<=n-1;j++){
               greatest= Math.max(greatest, arr[j]);
            }
            ans[i]=greatest;
            i++;
        }
        ans[n-1]=-1;
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    } 
}
