package Loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b=0;
        while(a!=0){
            b=(b*10)+a%10;
            a=a/10;}
        System.out.println(a==b?"Palindrome":"Not Palindrome");
    }
}
