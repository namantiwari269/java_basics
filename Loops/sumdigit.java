package Loops;
import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int count = sc.nextInt();
        int sum=0;
        do{
            int a =count%10;
            sum += a;
            count/=10;

            
        }while(count>0);
        System.out.println(sum);
    }
}
