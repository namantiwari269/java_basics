package Basic;

import java.util.Scanner;
public class chardatatype {
    public static void main(String[] args) {
        // a,b,c...z
        // A,B,C,...Z
        // 0 1 2 3 .... 9
        // ! @ $ % ^ & *
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        int n = (int)ch;
        System.out.println(ch);
        System.out.println(n);
    }
}
