package Conditionals;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        double marks=sc.nextDouble();
        if(marks<=100 && marks>=81){
            System.out.println("Very Good");
        }
        else if(marks<=80 && marks>=61){
            System.out.println("Good");
        }
        else if(marks<=60 && marks>=41){
            System.out.println("Average");
        } 
        else if(marks<=40){
            System.out.println("Fail");
    }
}}
 