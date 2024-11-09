package Exceptionprg;
public class Numberformat
{
		public static void main(String[] args)
		{
			try
			{
				String s="abc";
				int i=Integer.parseInt(s);
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			
		}
	}

}
