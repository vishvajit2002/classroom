package Constructorpg;
// Class with a private constructor
public class PrivateConstructor
{
	// Private constructor
	private PrivateConstructor()
	{
		System.out.println("hi there");
	}

	// Static method to create an instance of the class
	public static void instance1()
	{
		PrivateConstructor hi = new PrivateConstructor();
	}
}

// Main class to run the program
class Main
{
	public static void main(String[] args)
	{
		// Calling the static method to create an instance
		PrivateConstructor.instance1();
	}
}
