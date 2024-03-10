package Loops;
import java.util.Scanner;
public class gcd {
        public static void main(String[] args) {
        // Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD = "+gcd);
    }    
}
