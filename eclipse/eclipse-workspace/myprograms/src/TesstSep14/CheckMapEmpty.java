package TesstSep14;
import java.util.HashMap;
import java.util.Map;
public class CheckMapEmpty
{
	public static void main(String[] args)
	{
		Map<String, Integer> mapWithValues = new HashMap<>();
		mapWithValues.put("Apple", 1);
		System.out.println("Map with values is empty: " + mapWithValues.isEmpty());

		Map<String, Integer> emptyMap = new HashMap<>();
		System.out.println("Empty map is empty: " + emptyMap.isEmpty());
	}
}
