

public class DepositThread implements Runnable 
{
	private Account account;
	private double amount;
	public DepositThread(Account account, double amount) 
	{
		//Set the account & balance
		this.account = account;
		this.amount = amount;
		

		
		//Thread t = new Thread();
		//t.start();
	}
	
	
	public void run()
	{
		//make a deposit
		synchronized(account)//wait for request to be completed
		{
			if (amount > 0)
			{
				try {
					account.deposit(amount);
					Thread.sleep(1000);
					} catch (Exception e1) 
					{
						e1.printStackTrace();
					}				
			}
			else
			{
				System.out.println("Error: Deposit amount must be more than Zero.");
			}
		}	
			
	}
	
}