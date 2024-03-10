package pattern;

import java.util.Scanner;

public class qcompattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++){
            for(int j = 1; j<=n;j++){
                if((i+j)>=n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k =1; k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
