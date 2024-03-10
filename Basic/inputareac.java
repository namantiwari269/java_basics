package Basic;
import java.util.Scanner;
public class inputareac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        double area = 3.141592 * r * r;
        System.out.println("Area ="+area);
}
}
