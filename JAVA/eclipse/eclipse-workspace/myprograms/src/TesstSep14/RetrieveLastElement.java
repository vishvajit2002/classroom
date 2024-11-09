package TesstSep14;
import java.util.LinkedList;
public class RetrieveLastElement
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		String lastElement = list.getLast();

		System.out.println("Last element in the list: " + lastElement);

	}
}
