package mypackage;
abstract class Bank
{
	abstract int getRateofInterest();
}
class SBI extends Bank
{
	int getRateofInterest()
	{
		return 7;
	}
}
class PNB extends Bank
{
	int getRateofInterest()
	{
		return 8;
	}
}
class Salary
{
	public static void main(String[] args)
	{
		Bank b;
		b=new SBI();
		System.out.println(b.getRateofInterest());
		
		b=new PNB();
		System.out.println(b.getRateofInterest());
		
	}
}




