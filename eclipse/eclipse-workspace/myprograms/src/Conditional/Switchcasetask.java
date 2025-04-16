package Conditional;
import java.util.*;
public class Switchcasetask
{
	 public static void main(String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter the first number:");
	    double num1 = sc.nextDouble();
	
	    System.out.println("Enter the second number:");
	    double num2 = sc.nextDouble();
	
	    System.out.println("Choose an operation: Add, Subtract, Multiply, Divide");
	    String operation = sc.next().toLowerCase(); //we getting string here
	
	    double result;
	
	    switch (operation) {
	        case "add":
	            result = num1 + num2;
	            System.out.println("The result of addition is: " + result);
	            break;
	        case "subtract":
	            result = num1 - num2;
	            System.out.println("The result of subtraction is: " + result);
	            break;
	        case "multiply":
	            result = num1 * num2;
	            System.out.println("The result of multiplication is: " + result);
	            break;
	        case "divide":
	            if (num2 != 0) {
	                result = num1 / num2;
	                System.out.println("The result of division is: " + result);
	            } else {
	                System.out.println("Error: Division by zero is not allowed.");
	            }
	            break;
	        default:
	            System.out.println("Invalid operation! Please choose Add, Subtract, Multiply, or Divide.");
	            break;
	    }
	
	    sc.close();
	    
	 }
	 //NOTE:-
//	 String input = sc.next();  // Read the next tokenString (only a word)
//	 string Value = sc.nextLine();  // Read the entire line
//	 int intValue = sc.nextInt();
//	 double doubleValue = sc.nextDouble();
//	 float floatValue = sc.nextFloat();
//	 long longValue = sc.nextLong();
//	 short shortValue = sc.nextShort();
}
