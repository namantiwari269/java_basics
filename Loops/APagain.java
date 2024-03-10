package Loops;
import java.util.Scanner;
public class APagain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int n= sc.nextInt();
       for (int i = 4; i <=3*n+1 ;i+=3)
       {
        System.out.println(i);
       }
    }
}
