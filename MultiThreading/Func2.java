class Th1 extends Thread
{
	public void run()
	{
		System.out.println("Thread A started\nThread A is going to sleep for 3 sec now");
		try {sleep(3000);}
		catch(Exception e) {}
		System.out.println("Thread A completed its execution");
	}
}
class Th2 extends Thread
{
	public void run()
	{
		System.out.println("Thread B is started \nThread B goes to suspend(koma) by itself");
		try {suspend();}
		catch(Exception e) {}
	}
}
class Func2
{
	public static void main(String args[])
	{
		System.out.println("From main : threads a and b are started");
		Th1 a = new Th1();
		Th2 b = new Th2();
		a.start();
		b.start();
		System.out.println("Reviving thread B...........");
		try { b.resume(); }
		catch(Exception e) {}
		//System.out.println("Oh no again Thread B goes to sleep");
		//try {b.sleep(3000);}
		//catch(Exception e){}
	}
}