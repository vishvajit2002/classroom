package TestAug24;
class OddNumberException extends Exception 
{
 public OddNumberException(String message) 
 {
     super(message);
 }
}
public class OddNumberCheck 
{
 static void checkIfOdd(int number) throws OddNumberException 
 {
     if (number % 2 != 0) 
     {
         throw new OddNumberException("The number " + number + " is odd.");
     } 
     else 
     {
         System.out.println("The number " + number + " is even.");
     }
 }

 public static void main(String[] args) 
 {
     int number = 7; 
     try 
     {
         checkIfOdd(number);
     } 
     catch (OddNumberException e) 
     {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}

