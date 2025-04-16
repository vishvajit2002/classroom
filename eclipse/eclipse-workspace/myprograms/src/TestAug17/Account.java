package TestAug17;
public class Account
{
	private String accountNumber;
	private int balance;
	public Account(String accountNumber,int balance)
	{
		this.accountNumber = accountNumber; 
        this.balance = balance;
		if(accountNumber==null ||accountNumber.isEmpty())
		{
			System.out.println("Account no can't be null and not be empty");
		}
		if(balance<0)
		{
			System.out.println("balance should be non-negative");
		}
	}
	public void display()
	{
		 if (accountNumber != null && !accountNumber.isEmpty() && balance >= 0) 
		 {
        System.out.println("your account no is "+this.accountNumber);
        System.out.println("your balance no is "+this.balance);
        System.out.println("Account created successfully!");
		 }
		 else
		 {
		   System.out.println("Account information is invalid.");
		 }
	}
	
        public static void main(String[] args) 
        {
        	Account a= new Account("",3000);
        	a.display(); 
        }
	}

	

	
