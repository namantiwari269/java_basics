package Array;
import java.util.Scanner;
public class basicsyntax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
                System.out.println("Enter element");
            arr[i]=sc.nextInt();
        }
                for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int a = arr.length;
        System.out.println(a);
    }
}
