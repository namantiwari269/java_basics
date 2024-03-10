package pattern;
import java.util.Scanner;
public class pattern2 {
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        int a = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
