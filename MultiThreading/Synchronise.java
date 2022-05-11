class Account
{
	public int balance;
	public int accNo;
	void displayBal()
	{
		System.out.println("Account No : " + accNo + " Balance: "+balance);	
	}
	synchronized void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println(amount + " is deposited");
		displayBal();
	}
	synchronized void withdraw(int amount)
	{
		balance = balance - amount;
		System.out.println(amount + " is withdrawn");
	}
}
class TranDeposit implements Runnable
{
	int amount;
	Account accountX;
	TranDeposit(Account x , int amount)
	{
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}
	public void run(){
		accountX.deposit(amount);
	}
}
class TranWithdraw implements Runnable{
	int amount;
	Account accountY;
	TranWithdraw(Account y , int amount)
	{
		accountY = y;
		this.amount = amount;
		new Thread(this).start();
	}
	public void run(){
		accountY.withdraw(amount);
	}
}
class Synchronise {
	public static void main(String args[])
	{
		Account ABC = new Account();
		ABC.balance = 1000;
		ABC.accNo = 111;
		TranDeposit t1;
		TranWithdraw t2;
		t1 = new TranDeposit(ABC , 1000);
		t2 = new TranWithdraw(ABC , 900);
	}
}