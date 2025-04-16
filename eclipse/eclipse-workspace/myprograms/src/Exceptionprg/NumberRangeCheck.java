package Exceptionprg;
// Custom exception for invalid number range
class InvalidNumberException extends Exception 
{
    public InvalidNumberException(String message) 
    {
        super(message);
    }
}

public class NumberRangeCheck 
{
    public static void main(String[] args) 
    {
        try 
        {
            int number =150; // Test with different values, like -10, 50, 200, etc.
            validateNumber(number);
            System.out.println("Number is within the valid range: " + number);
        } 
        catch (InvalidNumberException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // Method to validate the number
    static void validateNumber(int number) throws InvalidNumberException 
    {
        if (number > 100 || number < 0) 
        {
            throw new InvalidNumberException("Invalid number: " + number + ". The number must be between 0 and 100.");
        }
    }
}
