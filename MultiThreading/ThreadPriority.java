class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A started");
        for(int i = 1; i <= 4; i++)
        {
            System.out.println("\t from thread A : i" + i);
        }
        System.out.println("Exiting from A");
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println("Thread B is started");
        for(int j = 1 ; j <= 4; j++)
        {
            System.out.println("\t from thread B : j = "+j);
        }
        System.out.println("Exiting from thread B");
    }
}
class C extends Thread
{
    public void run()
    {
        System.out.println("Thread C is started");
        for(int k = 0 ; k < 5 ; k++)
        {
            System.out.println("\t from thread c : k = "+k);
        }
    }
}
public class ThreadPriority extends Thread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(a.getPriority() + 1);
        a.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread A started");
        a.start();
        System.out.println("Thread B Started");
        b.start();
        System.out.println("Thread C started");
        c.start();
        System.out.println("End of main thread");
    }   
}