package TestOct19;
import java.util.HashMap;
import java.util.Map;
public class CheckMapEmpty
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		if (isMapEmpty(map))
		{
			System.out.println("The map is empty.");
		} else
		{
			System.out.println("The map contains key-value mappings.");
		}
		map.put("Key1", "Value1");
		if (isMapEmpty(map))
		{
			System.out.println("The map is empty.");
		} else
		{
			System.out.println("The map contains key-value mappings.");
		}
	}
	public static boolean isMapEmpty(Map<?, ?> map)
	{
		return map.isEmpty(); 
	}
}
