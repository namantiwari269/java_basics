package Loops;
import java.util.Scanner;
public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int flag =0;
        if(n==0||n==1)System.out.println("Neither prime nor composite");
        else{
        for(int i = 2; i<= n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        System.out.println(flag==1?"Composite":"Prime");}
    }
}
