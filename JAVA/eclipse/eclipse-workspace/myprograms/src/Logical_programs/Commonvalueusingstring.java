package Logical_programs;
import java.util.Set;
public class Commonvalueusingstring
{
	void FindEle(String[] arr1, String[] arr2)
		{
			Set<String> set=new Hashset<>();
			for(int i=0; i<arr.length();i++)
			{
				for(int j=0; i<arr2.length;j++)
				{
					(arr1[i].equals(arr2[j]))
					{
						set.add(arr1[i]);
						break;
					}
				}
			}
			for(String i:set)
			{
				System.out.println(i+"");
			}
		}

	public static void main(String[] args)
	{
		String[] arr1 =
		{ "choco", "girls", "Boys" };
		String[] arr2 =
		{ "oco", "gews", "ys" };
		System.out.println("Array" + Array.toString(arr1));
		System.out.println("Array" + Array.toString(arr2));
	}

}
