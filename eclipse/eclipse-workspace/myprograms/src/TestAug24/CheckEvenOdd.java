package TestAug24;
public class CheckEvenOdd {
    public static void main(String[] args) {
        int number = 42; 
        String numberStr = String.valueOf(number);
        if (numberStr.endsWith("0") || numberStr.endsWith("2") 
            || numberStr.endsWith("4") || 
            numberStr.endsWith("6") || numberStr.endsWith("8")) 
        {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
