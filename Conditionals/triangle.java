package Conditionals;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Sides");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)System.out.println("It is a triangle");
        else System.out.println("It is not a triangle");
    }
    
}
