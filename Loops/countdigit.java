package Loops;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int count = sc.nextInt();
        int flag=0;
        do{
            count=count/10;
            flag++;
        }while(count>0);
        System.out.println(flag);

    }
}
