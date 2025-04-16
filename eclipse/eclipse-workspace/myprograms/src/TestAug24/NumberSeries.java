package TestAug24;
public class NumberSeries 
{
    public static void main(String[] args)
    {
        int start = 1;
        int[] increments = {5, 4, 3, 4}; 
        System.out.print(start + " ");
        for (int i = 0; i < increments.length; i++)
        {
            start += increments[i];
            System.out.print(start + " ");
        }
    }
}
