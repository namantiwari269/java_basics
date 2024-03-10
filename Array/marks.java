package Array;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of marks");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("Enter marks");
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i<n;i++){
            if(arr[i]<35){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
