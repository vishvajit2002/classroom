package mypackage;

public class SimpleConversions
{
	public static void main(String[] args)
	{

		// Converting between primitive types
		// From smaller to larger type (automatically done by Java)
		int number = 100;
		long biggerNumber = number; // int to long
		float evenBiggerNumber = biggerNumber; // long to float

		// From larger to smaller type (requires explicit casting)
		double decimalNumber = 9.78;
		int wholeNumber = (int) decimalNumber; // double to int

		// Converting primitive types to String
		int num = 123;
		String numAsString = Integer.toString(num); // int to String

		double decimal = 45.67;
		String decimalAsString = Double.toString(decimal); // double to String

		char character = 'A';
		String charAsString = Character.toString(character); // char to String

		// Converting String to primitive types
		String str = "456";
		int stringToInt = Integer.parseInt(str); // String to int

		String decimalStr = "78.90";
		double stringToDouble = Double.parseDouble(decimalStr); // String to double

		// Converting char to int (ASCII value)
		char charVal = 'B';
		int asciiValue = (int) charVal; // char to int

		// Converting int to char (character from ASCII value)
		int ascii = 65;
		char charFromAscii = (char) ascii; // int to char

		// Printing results
		System.out.println("Converted int to long: " + biggerNumber);
		System.out.println("Converted long to float: " + evenBiggerNumber);
		System.out.println("Converted double to int: " + wholeNumber);
		System.out.println("Converted int to String: " + numAsString);
		System.out.println("Converted double to String: " + decimalAsString);
		System.out.println("Converted char to String: " + charAsString);
		System.out.println("Converted String to int: " + stringToInt);
		System.out.println("Converted String to double: " + stringToDouble);
		System.out.println("Converted char to int (ASCII): " + asciiValue);
		System.out.println("Converted int to char: " + charFromAscii);
	}
}
