package Arrayeg;
import java.util.Scanner;
public class Jaggedarreg4
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of arrays:");
        int numberofarrays = scan.nextInt();
        int[][] arr = new int[numberofarrays][];
        
        System.out.println("Enter the number of arrays:");
        int numberofarrays1 = scan.nextInt();

        int[] increments = new int[numberofarrays1];
        
        // Get the values for the increments array from the user
        for (int i = 0; i < numberofarrays1; i++) {
            System.out.print("Enter the size for array " + (i + 1) + ": ");
            increments[i] = scan.nextInt();
        }

        //int[] increments = {1,2,3,2,1};\
        
       
        for (int i = 0; i < numberofarrays; i++) 
        {
            arr[i] = new int[increments[i]];
            
        }
        
        for(int i=0; i<numberofarrays;i++)
        {
            for (int j = 0; j <arr[i].length ; j++) 
        {
            System.out.print("Enter the value for arr[" + i + "][" + j + "]: ");
            arr[i][j] = scan.nextInt();
        }
        }
        
        for(int i=0; i<numberofarrays;i++)
        {
            for (int j = 0; j<arr[i].length ; j++) 
        {
            	
            System.out.print(arr[i][j]+"" );
        }
            System.out.println();
        }
        
        
        scan.close();
    }
}
