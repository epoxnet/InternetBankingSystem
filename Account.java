public class Account 
{
	private double balance = 0;

	public Account(double balance) 
	{
		this.balance = balance;
	}
	
	/** Return balance */
	public double getBalance()
	{
		return balance;
	}

	/** Increase balance by amount 
	 * @throws Exception */
	public void deposit(double amount) throws Exception
	{

			balance = balance + amount;
			System.out.printf("You deposited : %f \n", amount);
			System.out.printf("Your new Balance is : %f \n", getBalance());
				
	}
	
	/** Decrease balance by amount */
	public void withdraw(double amount) throws Exception
	{
			balance = balance - amount;
			System.out.printf("You withdrawed : %f \n", amount);
			System.out.printf("Your new Balance is : %f \n", getBalance());
		
	}	
} 





 