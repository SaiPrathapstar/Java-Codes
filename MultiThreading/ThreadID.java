import java.lang.*;
class Th extends Thread
{
	public void run()
	{
		try{
		System.out.println(Thread.currentThread().getId() + " is running");
		}
		catch(Exception e){
			System.out.println("Caught exception "+ e);
		}
	}
}
class ThreadID
{
	public static void main(String args[])
	{
		for(int i = 0 ; i < 8 ; i++)
		{
			Th object  = new Th();
			object.start();
		}
	}
}