package TwoDimensionArray;

public class addmatrix {
    public static void main(String[] args) {
    int[][] a= {{1,2,3,4},{7,67,2,67},{21,5,33,7}};
    int[][] b= {{43,54,23,6},{1,45,25,4},{34,74,13,56}};
    int n = a.length;
    int m = a[0].length;
    int[][] c = new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
        
    }
}
