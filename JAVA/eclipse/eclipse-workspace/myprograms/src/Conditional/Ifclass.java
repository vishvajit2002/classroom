package Conditional;
import java.util.*;
public class Ifclass 
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number- ");
    int a = sc.nextInt();

    System.out.print("Enter second number- ");
    int b = sc.nextInt();

    System.out.print("Enter third number- ");
    int c = sc.nextInt();

    int d = a + b + c;
    System.out.println("Total = " + d);

    if (d >= 25 && d <= 100) {
        System.out.println("The value is greater than 25 & lesser than 100: " + d);
    } else {
        System.out.println("The value is not in the range 25 to 100.");
    }

    sc.close();  // Always close the scanner to avoid resource leaks
}
}
