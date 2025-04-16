package TesstSep14;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToArrayListConverter
{
	public static void main(String[] args)
	{
		String[] array ={ "Apple", "Banana", "Cherry" };

		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
		System.out.println("added elements into the arraylist");

		for (String s : arrayList)
		{
			System.out.println(s);
		}
	}
}
