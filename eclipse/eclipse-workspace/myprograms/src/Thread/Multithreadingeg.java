package Thread;
public class Multithreadingeg implements Runnable
{

	public static void main(String[] args)
	{
		Thread example1=new Thread("sample");
		Thread example2=new Thread("sample1");
		example1.start();
		example2.start();
		System.out.println("thread names are:");
		System.out.println(example1.getName());
		System.out.println(example2.getName());
	}
	@Override
	public void run()
	{
		
	}

}
