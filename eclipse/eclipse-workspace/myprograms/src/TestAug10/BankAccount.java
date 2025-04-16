package TestAug10;
abstract class BankAccount01
{
	float balance;
	int accno;
	abstract void deposit(float amount);
	abstract void withdraw(float amount);
}

class CheckingAccount extends BankAccount01
{
	void deposit(float amount)
	{
		balance += amount;
		System.out.println("Deposited amount: " + amount);
	}

	void withdraw(float amount)
	{
		if (amount > balance)
		{
			System.out.println("Insufficient balance");
		} else
		{
			balance -= amount;
			System.out.println("Withdrawn amount: " + amount);
		}
	}

	void display()
	{
		System.out.println("Account balance: " + balance);
	}
}

public class BankAccount
{
	public static void main(String[] args)
	{
		CheckingAccount a = new CheckingAccount();
		a.deposit(100.10f);
		a.withdraw(10f);
		a.display();
	}
}
