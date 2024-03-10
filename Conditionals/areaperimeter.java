package Conditionals;
import java.util.Scanner;
public class areaperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sides of the Rectangle");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double area = a*b;
        double perimeter = 2*(a+b);
        if (area < perimeter)System.out.println("Area is less than perimeter");
        else if (area > perimeter)System.out.println("Area is greater than perimeter");
        else System.out.println("Area is equal to perimeter");
    }
}
