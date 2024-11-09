package mypackage;

public class CharManipulation
{
	public static void main(String[] args)
	{
		char[] str =
		{ 'h', 'i', ' ', 't', 'h', 'e', 'r', 'e' };

		int addPosition = 2; 
		char charToAdd = 'i'; 

		int removePosition = 5; 

		char[] addedCharArray = new char[str.length + 1];

		for (int i = 0; i < addPosition; i++)
		{
			addedCharArray[i] = str[i];
		}

		addedCharArray[addPosition] = charToAdd;

		for (int i = addPosition; i < str.length; i++)
		{
			addedCharArray[i + 1] =  [i];
		}

		System.out.print("After adding a character: ");
		for (char c : addedCharArray)
		{
			System.out.print(c);
		}
		System.out.println();

		char[] removedCharArray = new char[addedCharArray.length - 1];

		for (int i = 0; i < removePosition; i++)
		{
			removedCharArray[i] = addedCharArray[i];
		}

		for (int i = removePosition; i < removedCharArray.length; i++)
		{
			removedCharArray[i] = addedCharArray[i + 1];
		}

		System.out.print("After removing a character: ");
		for (char c : removedCharArray)
		{
			System.out.print(c);
		}
	}
}
////Original string
//String originalString = "hi there";
//
//// Convert string to char array
//char[] charArray = new char[originalString.length()];
//
//// Copy each character from the string to the char array
//for (int i = 0; i < originalString.length(); i++) {
//    charArray[i] = originalString.charAt(i);
//}
//
//// Print the char array
//System.out.print("Char array: ");
//for (char c : charArray) {
//    System.out.print(c);
//}