
public class InternetBankingSystem 
{
	public static void main(String [] args ) 
	{
		Account accountObject = new Account(100);
		new Thread(new DepositThread(accountObject,30)).start();
		new Thread(new DepositThread(accountObject,20)).start();
		new Thread(new DepositThread(accountObject,10)).start();
		new Thread(new WithdrawThread(accountObject,30)).start();
		new Thread(new WithdrawThread(accountObject,50)).start();
		new Thread(new WithdrawThread(accountObject,20)).start();
		//I added two more case for negative deposit and withdraw more than available balance
		new Thread(new WithdrawThread(accountObject,1000)).start();
		new Thread(new DepositThread(accountObject,-100)).start();
	} // end main()
}