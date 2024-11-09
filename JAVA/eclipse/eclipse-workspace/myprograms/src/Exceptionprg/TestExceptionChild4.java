package Exceptionprg;
public class Parent
{
	void msg() throws Exception
	{
		System.out.println("p9arent method");
	}
}
	class TestExceptionChild4 extends Parent
	{
		void msg() throws ArithmeticException
		{
			System.out.println("child method");
		}
		public static void main(String[] args)
		{
			Parent p=new Parent();
			p.msg();  // abstraction through inheritance
			TestExceptionChild4 t=new TestExceptionChild4();
			t.msg();
		}
		try {
			p.msg();
		}
		catch(Exception e)
		{
			
		}
	}


