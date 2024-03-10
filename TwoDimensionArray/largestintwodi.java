package TwoDimensionArray;

public class largestintwodi {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{7,67,2,67},{21,5,33,7}};
        int n = arr.length;
        int m = arr[0].length;
        int greatest= arr[0][0];
        for(int i =0 ; i< n;i++){
            for(int j =0 ; j<m;j++){
            greatest= Math.max(arr[i][j],greatest);
            }
        }
        System.out.println(greatest);
    }
}
