package Array;

public class sortzeroone {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1,0,0,0};
        int noofzeroes=0;
        for (int ele : arr){
            if(ele==0){
                noofzeroes++;
            }
        }
        for(int i=0;i< noofzeroes;i++){
            arr[i]=0;
        }
        for(int i=noofzeroes;i<arr.length;i++){
            arr[i]=1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
