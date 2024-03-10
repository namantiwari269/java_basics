package Arraylist;
import java.util.ArrayList;
public class basicsofarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);

        System.out.println(arr.get(0));

        // Print ArrayList using loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // Print ArrayList using toString()
        System.out.println(arr);

        // Update element at index 2
        arr.set(2, 300);

        // Print ArrayList using loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // Add element 90 to the end of the ArrayList
        arr.add(90);

        // Print size of ArrayList
        System.out.println();
        System.out.println(arr.size());

        // Print ArrayList using loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
}}
