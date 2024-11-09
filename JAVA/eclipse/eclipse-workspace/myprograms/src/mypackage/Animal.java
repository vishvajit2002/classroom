package mypackage;
abstract class Zoo
{
	abstract void Sound();
}

class Lion extends Zoo
{
	void Sound()
	{
		System.out.println("I'm the lion - ROARRRRR");
	}
}
class Tiger extends Zoo
{
	void Sound()
	{
		System.out.println("I'm the Tiger - wrrrrrr");
	}
}

public class Animal 
{
	public static void main(String[] args) 
	{
		Zoo b;
		b=new Lion();
		b.Sound();
		b=new Tiger();
		b.Sound();
	}
}
