package Exceptionprg;

// Class representing custom exception
class InvalidAgeException extends Exception
{ // Corrected class definition
	// Constructor that takes a message
	public InvalidAgeException(String str)
	{
		// Calling the constructor of parent Exception
		super(str);
	}
}

// Class that uses custom exception InvalidAgeException
public class TestCustomException1
{
	// Method to check the age
	static void validate(int age) throws InvalidAgeException
	{
		if (age < 18)
		{
			// Throw an object of user-defined exception
			throw new InvalidAgeException("Age is not valid to vote");
		} else
		{
			System.out.println("Welcome to vote");
		}
	}

	// Main method
	public static void main(String[] args)
	{
		try
		{
			// Calling the method
			validate(13);
		} catch (InvalidAgeException ex)
		{
			System.out.println("Caught the exception");
			// Printing the message from InvalidAgeException object
			System.out.println("Exception occurred: " + ex.getMessage());
		}
		System.out.println("Rest of the code");
	}
}
