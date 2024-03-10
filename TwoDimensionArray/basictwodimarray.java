package TwoDimensionArray;

import java.util.Scanner;

public class basictwodimarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("enter element "+ i+" , "+ j);
                arr[i][j]= sc.nextInt();

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print (arr[i][j]+" ");
            }
            System.out.println();
        }
        int m = arr.length; // no. of rows
        int n = arr[0].length;//no. of column
    }
}
