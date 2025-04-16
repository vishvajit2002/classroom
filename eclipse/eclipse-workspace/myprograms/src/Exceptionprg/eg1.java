package Exceptionprg;
public class eg1
{
	public static void main(String[] args)
	{
		int n=18;
		trynumber(n);
		n=7;
		trynumber(n);
	}
	public static void trynumber(int n)
	{
		try
		{
			trynumber(n);
			System.out.println(n + "is even");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("error:"+e.getMessage());
		}
	}
}
