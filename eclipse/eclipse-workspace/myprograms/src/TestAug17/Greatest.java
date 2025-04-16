package TestAug17;
public class Greatest
{
	public void Greatestt(int num1, int num2)
	{
		int greatest = Math.max(num1, num2);
		System.out.println("The greatest values is "+greatest);
    }
	public void Greatestt(int num1, int num2, int num3)
	{
		int greatest = Math.max(num1, Math.max(num2, num3));
		System.out.println("The greatest values is "+greatest);
    }
	public static void main(String[] args)
	{
		Greatest a= new Greatest();
		a.Greatestt(10,20);
		a.Greatestt(10,20,30);
	}
}
