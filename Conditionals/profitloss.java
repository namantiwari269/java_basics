package Conditionals;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price : ");
        double c = sc.nextDouble();
        System.out.println("Enter the selling Price : ");
        double s = sc.nextDouble();
        double profitloss = c-s;
        if(c>s)System.out.println("Loss : "+profitloss);
        else if(c==s)System.out.println("No Profit No Loss");
        else System.out.println("Profit : "+ -profitloss);

    }
}
