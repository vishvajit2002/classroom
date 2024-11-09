package mypackage;

class Account
{
	int acc_no;
	String name;
	float amount;

	void insert(int a, String n, float amt)
	{
		acc_no = a;
		name = n;
		amount = amt;
	}

	void deposit(float amt)
	{
		amount = amount + amt;
		System.out.println(amt + "deposited");
	}

	void withdraw(float amt)
	{
		if (amount < amt)
		{
			System.out.println("insufficient balance");

		} else
		{
			amount = amount - amt;
			System.out.println(amt + "withdrawn");
		}
	}

	void checkbalance()
	{
		System.out.println("balance is" + amount);
	}

	void display()
	{
		System.out.println(acc_no + "" + name + "" + amount);
	}

}

class Testaccount
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Account a1 = new Account();
		a1.insert(83453, "ankit", 1000);
		a1.deposit(4000);
		a1.withdraw(15000);
		a1.display();
		a1.checkbalance();
	}

}
