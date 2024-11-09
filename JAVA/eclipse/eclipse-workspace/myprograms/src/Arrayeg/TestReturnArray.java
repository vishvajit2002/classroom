package Arrayeg;
public class TestReturnArray
{
	static int[] get()
	{
		return new int[] {10,30,40,50,70,40,90};
	}
	public static void main(String[] args)
	{
		int arr[]=get();
		//calling method which returns an array
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
