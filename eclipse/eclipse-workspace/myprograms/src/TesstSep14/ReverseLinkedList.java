package TesstSep14;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList
{
	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");
		linkedList.add("Date");

		System.out.println("LinkedList in reverse order:");

		Iterator<String> iterator = linkedList.descendingIterator();

		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
