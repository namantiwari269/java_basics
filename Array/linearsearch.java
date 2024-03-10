package Array;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n;i++){
            System.out.println("Enter an element");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to be found");
        int x = sc.nextInt();
        for(int i =0 ; i<n;i++){
            if(arr[i]==x){
                System.out.println("Found at index "+i);
                break;
            }
            
        }
    }
}
