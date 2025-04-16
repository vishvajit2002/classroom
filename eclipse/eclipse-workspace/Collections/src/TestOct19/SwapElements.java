package TestOct19;
import java.util.ArrayList;
public class SwapElements
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		System.out.println("Original List: " + list);

		swap(list, 1, 3);

		System.out.println("List after swapping: " + list);
	}
	public static void swap(ArrayList<String> list, int index1, int index2)
	{
		String temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
}
