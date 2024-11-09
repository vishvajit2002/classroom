package Conditional;
import java.util.*;
public class Ifelseclass
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number-");
	int a= sc.nextInt();
	
	
	System.out.print("Enter second number-");
	int b= sc.nextInt();
	
	
	System.out.print("Enter third number-");
	int c= sc.nextInt();
	int d=a+b+c;
	System.out.println("Total="+d);
	
	if(d>50)
		System.out.println("The value is greater than 50 "+d);
	
	
	else if(d>60)
		System.out.println("The value is greater than 60 "+d);
	else if(d>70)
		System.out.println("The value is greater than 70 "+d);
	else if(d>80)
		System.out.println("The value is greater than 80 "+d);
	
	else
		System.out.println("The value is lesser than 80  "+d);
	
	
		
	}

}
