package Autoboxing;
public class autoboxing
{
	public static void main(String args[]){  
	//Converting primitive into object (autoboxing)
		int a = 20;  
		Integer i = Integer.valueOf(a); // Explicit boxing: converting int into Integer using valueOf() method
		Integer j = a;                   // Autoboxing: compiler automatically converts int to Integer implicitly
		System.out.println(a + " " + i + " " + j);
  
	
	//Converting Integer to int (unboxing)  
		//Converting Integer to int    
		Integer a1 = 3;              
		int ii = a1.intValue();       // Explicit unboxing: Converting the Integer object 'a' back to a primitive int
		int jj = a1;                  // Implicit unboxing: The Integer 'a' is automatically converted to a primitive int
		System.out.println(a1 + " " + ii + " " + jj);    
	}
}


//The wrapper class in Java provides 
//the mechanism to convert 
//1.primitive into object (autoboxing)  &
//object into primitive(unboxing)


//Primitive 	Wrapper class
//boolean       Boolean
//char			Character
//byte			Byte
//short			Short
//int			Integer
//long			Long
//float			Float
//double	    Double