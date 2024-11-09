package TestOct19;
import java.util.ArrayList;
import java.util.Collections;
public class MaxMinInList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		numbers.add(3);

		System.out.println("Numbers: " + numbers);

		int max = Collections.max(numbers);
		int min = Collections.min(numbers);

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}
}
