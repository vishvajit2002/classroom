package Collections.List;
import java.util.Map;
import java.util.HashMap; 

public class Mapeg
{
	public static void main(String[] args)
	{
		Map<String,Integer> numbers=new HashMap();
		//insert element to the map
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		System.out.println("map"+numbers);
		
		//access key
		System.out.println("keys"+numbers.keySet());
		
		//access values of the map
		System.out.println("values"+numbers.values());
		
		//access entries of the map
		System.out.println("entries"+numbers.entrySet());
		
		//remove elements from the map
		int value=numbers.remove("two");
		System.out.println("Removed value"+value);
		//after removing
		System.out.println("entries after removing"+numbers.entrySet());

		
	}
}
