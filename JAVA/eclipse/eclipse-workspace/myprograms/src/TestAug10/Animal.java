package TestAug10;

abstract class Animalabs
{
	abstract void MakeSound();

	void print()
	{
		System.out.println("hello there");
	}
}

class Dog extends Animalabs
{
	void MakeSound()
	{
		System.out.println("I'm the Dog - Bow Bow");
	}
}

public class Animal
{
	public static void main(String[] args)
	{
		Animalabs b = new Dog();
		b.MakeSound();
		b.print();
	}
}
