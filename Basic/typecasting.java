package Basic;
import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = (double) a;
        b=b/2;
        System.out.println(b);

    }
}
/*
Int / Int = Int
Double / Double = Double
Double / Int = Double
Int / Double = Double
 */
