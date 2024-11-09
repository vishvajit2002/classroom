package Logical_programs;
import java.util.Scanner;
public class Sumofodd
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	int[] array=new int[n];
	for(int i=0; i<n; i++ )
	{
		System.out.println("enter the array["+i+"]");
		array[i]=scan.nextInt();
	}
	int sum=0;
	for(int i=0; i<array.length; i++)
	{
		if(array[i]%2!=0)
		{
			sum=sum+array[i];
		}
	}
	System.out.println("the sum of odd no array"+sum);
	
}
}

//For adding the odd elements in the new array use this below concept


//int[] oddArray = new int[count];
//int index = 0;
//
//// Add odd elements to the new array
//for (int i = 0; i < array.length; i++) {
//    if (array[i] % 2 != 0) {
//        oddArray[index] = array[i];
//        index++;
//    }
//}