package Conditionals;
import java.util.Scanner;
public class switches {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the equation");
     int a = sc.nextInt();
     char c = sc.next().charAt(0);
     int b = sc.nextInt();
     switch(c){
         case '+':
             System.out.println(a+b);
             break;
         case '-':
             System.out.println(a-b);
             break;
         case '*':
             System.out.println(a*b);
             break;
         case '/':
             System.out.println(a/b);
             break;
        default:
         System.out.println("Invalid Input");
     }
    }
}
