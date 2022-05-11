class Th1 extends Thread
{
	public void run()
	{
		for(int i = 0 ; i < 5 ; i++)
		{
			if(i == 1) yield();
			System.out.println("From Thread A : i = " + i);
		}
	}
}
class Th2 extends Thread
{
	public void run()
	{
		for(int j = 1 ; j <= 5 ; j++)
		{
			if(j == 2) stop();
			System.out.println("From Thread B : j = "+ j);
		}
	}
}
class Th3 extends Thread
{
	public void run()
	{
		for(int k = 1 ; k <= 5 ;k++)
		{
			if(k ==1 )
			{
				try{ sleep(2000);}
				catch(Exception e) {}
			}
			System.out.println("from Thread C : k = " + k);
		}
	}
}
class Func
{
	public static void main(String args[]){
		Th1 a = new Th1();
		Th2 b = new Th2();
		Th3 c = new Th3();
		a.start(); b.start(); c.start();
		System.out.println("From main : All threads started");
	}
}