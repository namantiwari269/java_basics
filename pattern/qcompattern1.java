package pattern;
import java.util.Scanner;
// # # # # 
// # # # * 
// # # * * 
// # * * * 
// * * * * 

        
//       1 
//     1 2 
//   1 2 3 
// 1 2 3 4 
public class qcompattern1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("# ");
            }

            for(int k = 0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }

            for(int k = 0;k<i;k++){
                System.out.print((k+1)+" ");
            }
            System.out.println();

        }
    }
}