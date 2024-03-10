package pattern;
import java.util.Scanner;
//for odd
//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 
//for even
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * * * 
//     * * * * * * * 
//       * * * * * 
//         * * * 
//           * 

public class qcompattern7 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int n=(x+1)/2;
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
        n=x-n;
        for(int i =0 ; i<n;i++){
            for(int j = 0 ; j<=i;j++){
                System.out.print("  ");
            }
            for(int k =0 ; k<n-i;k++){
                System.out.print("* ");
            }
            for(int l =0 ; l<n-i-1;l++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
