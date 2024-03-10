package pattern;
import java.util.Scanner;
public class qcompattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 0;i<(2*n-1);i++){
            System.out.print("* ");
        }
        System.out.println("");
        n=n-1;
        for(int i =1;i<=n;i++){
            for(int j =1 ; j<=n-i+1;j++){
                System.out.print("* ");
            }
            for(int k =1;k<=n;k++){
                if(i+k>=n+1){
                    System.out.print("  ");
                }
            }
            for(int l =1; l<i;l++){
                System.out.print("  ");
            }
            for(int m = 0 ; m<=n-i;m++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
// * * * * * * * 
// * * *   * * * 
// * *       * * 
// *           * 