package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo
{
	public static void main(String[] args)
	{
		List<String> arrayList = new ArrayList<>();

		// 1. Add elements
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		System.out.println("Initial ArrayList: " + arrayList);

		// 2. Add at specific index
		arrayList.add(1, "Mango");
		System.out.println("After inserting Mango at index 1: " + arrayList);

		// 3. Get element by index
		System.out.println("Element at index 2: " + arrayList.get(2));

		// 4. Set element at index
		arrayList.set(2, "Grapes");
		System.out.println("After replacing Orange with Grapes: " + arrayList);

		// 5. Remove element by index
		arrayList.remove(1);
		System.out.println("After removing element at index 1: " + arrayList);

		// 6. Remove by element
		arrayList.remove("Banana");
		System.out.println("After removing Banana: " + arrayList);

		// 7. Iterate over elements
		System.out.print("Iterating using for loop: ");
		for (String fruit : arrayList)
		{
			System.out.print(fruit + " ");
		}
		System.out.println();

		// 8. Sorting elements
		Collections.sort(arrayList);
		System.out.println("Sorted ArrayList: " + arrayList);

		// 9. Check if element exists
		System.out.println("Does list contain 'Apple'? " + arrayList.contains("Apple"));

		// 10. Find size of list
		System.out.println("Size of ArrayList: " + arrayList.size());

		// 11. Clear list
		arrayList.clear();
		System.out.println("After clearing ArrayList: " + arrayList);
	}
}


