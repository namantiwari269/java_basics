package Array;
public class twosum {
    public static void main(String[] args) {
        int[] arr = {3,-1,8,5,4,9,2};
         int x= 9;
         for(int i=0; i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println("Index "+i+" and "+j);
                    break;
                }

            }
         }
    }
}
