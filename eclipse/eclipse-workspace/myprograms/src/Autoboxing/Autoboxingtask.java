package Autoboxing;
import java.lang.*;
public class Autoboxingtask {
    public static void main(String[] args) {
    int a = 10;
    boolean b = true;

    // Autoboxing: converting primitive to object internally
    Integer a1 = a; 
    Boolean b1 = b;

    // Explicit boxing: converting primitive to object explicitly
    Integer a2 = Integer.valueOf(a); 
    Boolean b2 = Boolean.valueOf(b);

    // Unboxing: converting object back to primitive
    int a3 = a1.intValue(); 
    boolean b3 = b1.booleanValue();

    // Printing the values to verify
    System.out.println("Primitive int: " + a);
    System.out.println("Boxed Integer: " + a1);
    System.out.println("Explicitly Boxed Integer: " + a2);
    System.out.println("Unboxed int: " + a3);

    System.out.println("Primitive boolean: " + b);
    System.out.println("Boxed Boolean: " + b1);
    System.out.println("Explicitly Boxed Boolean: " + b2);
    System.out.println("Unboxed boolean: " + b3);
    }
}
