package Exceptionprg;
public class NumberCheck 
{
    public static void main(String[] args) 
    {
        String input = "12214wgas"; // Test with different strings like "123", "456", "78.9", "abc", etc.
        try 
        {
            // Attempt to parse the string as a number
            int number = Integer.parseInt(input);
            System.out.println("The string is a valid number: " + number);
        } 
        catch (NumberFormatException e) 
        {
            // Handle the exception if the string is not a valid number
            System.out.println("The string is not a valid number.");
        }
    }
}

