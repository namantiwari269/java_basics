package Basic;
import java.util.Scanner;
public class modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a%b);
        // a%b = a [a<b]
        // a%(-b)= a%b
        // (-a)%b = -[a%b]
        //
        }
}
