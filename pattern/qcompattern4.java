package pattern;
import java.util.Scanner;
public class qcompattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            for(int l =0;l<=n-i-1;l++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            for(int k =0;k<i;k++){
                System.out.print(i-k+" ");
            }
            System.out.println("");
        }

    }
}
//           1 
//         1 2 1 
//       1 2 3 2 1 
//     1 2 3 4 3 2 1 
//   1 2 3 4 5 4 3 2 1 