package Stringfunc;
public class Strfuncc
{
	public static void main(String[] args)
	{
		String a="hi THEre";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		//trim()removes the whitespaces at the beginning and the end
		String a1="  hi   there  .  welcome   ";
		System.out.println(a1.trim());
		System.out.println(a1.startsWith("  "));
		System.out.println(a1.endsWith("  "));
		System.out.println(a1.charAt(3));
//intern() checks if an identical string already exists in the Java string pool:
//If the string exists, intern() returns the reference to the existing string in the pool.

//Memory Efficiency: It avoids storing multiple copies of the same string.
//Faster Comparison: If two strings are interned, you can compare them with ==, and it will check if they are the same object in memory.
	
		String b=new String("hello"); //stores in heap bcoz of new keyword
		String c= "hello"; //stores in pool bcoz of no "new" keyword
		String d= b.intern(); // intern return the b's object reference("hello") to the d. and string D gets stored in pool, bcoz of no "new" keyword
   
		System.out.println(b== c); //false, different object references (bcoz one is in heap, and one in pool)
		System.out.println(c == d); // true, both point to the same object in the pool
		
		String conca=b.concat(c).concat(d);
		System.out.println(conca);
		
		
//The String.valueOf() method in Java is used to convert various types (like integers, characters, booleans, etc.)
//into their string representations.
		int num = 10;
		String strNum = String.valueOf(num); // Converts the integer 10 into the string "10"
		System.out.println(strNum);
		
		
		String str1 = "hello world";
		String newStr = str1.replace('l', 'p'); // Replaces all 'l' with 'p'
		System.out.println(newStr); 
	}
}
