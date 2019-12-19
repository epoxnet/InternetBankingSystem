public class WithdrawThread implements Runnable
{
	private Account account;
	private double amount;
	
	public WithdrawThread(Account account, double amount)
	{
		this.account = account;
		this.amount = amount;
		
		//Thread t = new Thread();
		//t.start();
	}
	
	public void run()
	{
		//make a withdrawal
		synchronized(account)//wait for request to be completed
		{
			if (account.getBalance() >= amount)
			{
				try {
					account.withdraw(amount);
					Thread.sleep(1000);
				} catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
			else
			{
				System.out.println("Error: Your Withdraw request is more than your available balance.");
			}
		
		}			
	}

}//end WithdrawThread class 