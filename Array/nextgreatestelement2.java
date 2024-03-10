package Array;

public class nextgreatestelement2 {
    public static void main(String[] args) {
        int[] arr= {12,8,41,37,2,49,16,28,21};
        int[] ans = new int[arr.length];
        int n = arr.length;
        int nge = arr[n-1];
        for(int i =n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(arr[i],nge);
        }
        ans[n-1]=-1;
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
