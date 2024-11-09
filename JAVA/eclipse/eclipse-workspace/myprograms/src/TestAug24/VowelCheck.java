package TestAug24;
class NoVowelException extends Exception
{
 public NoVowelException(String message) 
 {
     super(message);
 }
}

public class VowelCheck 
{
 static void checkVowels(String input) throws NoVowelException
 {
     String lowerCaseInput = input.toLowerCase();
     if (!lowerCaseInput.contains("a") && !lowerCaseInput.contains("e") &&
         !lowerCaseInput.contains("i") && !lowerCaseInput.contains("o") &&
         !lowerCaseInput.contains("u")) {
         throw new NoVowelException("No vowels found in the string: " + input);
     }
     System.out.println("The string contains vowels: " + input);
 }
 public static void main(String[] args) 
 {
     String str1 = "hello";
     String str2 = "sky";
     try 
     {
         checkVowels(str1); 
         checkVowels(str2); 
     } 
     catch (NoVowelException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}

