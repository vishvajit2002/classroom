package TestAug24;
import java.util.Scanner;
public class SimpleDuplicateCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) 
        { 
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (numbers[i] == numbers[j])
                {
                    System.out.println("Duplicate number found: " + numbers[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicates found.");
        scanner.close();
    }
}
