package Array;
import java.util.Scanner;
public class secondgreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n;i++){
            System.out.println("Enter an element");
            arr[i]=sc.nextInt();
        }
        int greatest= arr[0];
        for(int i =0 ; i<n;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        int sgreatest = arr[0];
        for(int i =0 ; i<n;i++){
            if(arr[i]>sgreatest && arr[i]!=greatest){
                sgreatest=arr[i];
            }
        }
        System.out.println("Second greatest number is "+sgreatest);
    }
}

