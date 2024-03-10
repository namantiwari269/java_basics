package pattern;
import java.util.Scanner;
public class pattern1 {
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 

// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 

// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1 ; i<=n ; i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

    for(int k = 1 ; k<=n ; k++){
            for(int l =1 ; l<=n ; l++){
                System.out.print((char)(l+64)+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1 ; i<=n ; i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }}
