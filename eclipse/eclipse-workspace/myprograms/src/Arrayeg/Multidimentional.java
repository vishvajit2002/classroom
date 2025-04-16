package Arrayeg;

import java.util.Scanner;

public class Multidimentional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array limit:");
        int I = input.nextInt();
        int[] a = new int[I];

        // Input elements into the array
        for (int i = 0; i < I; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            a[i] = input.nextInt();
        }

        System.out.println("Cubic values of array elements:");
        // Calculate and print cubic values of elements
        for (int e : a) 
        {
            System.out.println(e * e * e);
        }
    }
}
