package TwoDimensionArray;

public class waveformprinting {
    public static void main(String[] args) {
    int[][] a= {{43,54,23,6},{1,45,25,4},{34,74,13,56}};
    int n = a.length;
    int m = a[0].length;
    for(int i =0 ; i<n;i++){
        if(i%2==0){
            for(int j=0 ; j<m;j++){
                System.out.println(a[i][j]+" ");
            }
        }
        else{
            for(int j =n ; j>=0;j--){
                System.out.println(a[i][j]+" ");
            }
        }
        System.out.println();
    }
    }
}
