package TwoDimensionArray;

public class transpose {
    public static void main(String[] args) {
    int[][] a= {{43,54,23,6},{1,45,25,4},{34,74,13,56}};
    int n = a.length;
    int m = a[0].length;
    int[][] b= new int[m][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            b[i][j]=a[j][i];
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }
    }
}
