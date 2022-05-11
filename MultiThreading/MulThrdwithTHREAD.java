import javax.annotation.processing.SupportedSourceVersion;

class ThreadA extends Thread
{
    public void run()
    {
        for(int i = 0 ; i <= 5 ; i++)
        {
            System.out.println("From Thread A  "+ -1*i);
        }
        System.out.println("Exiting from thread A");
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int j = 1 ; j <= 5 ; j++)
        {
            System.out.println("From Thread B  "+2*j);
        }
        System.out.println("Exiting from thread B");
    }
}
class ThreadC extends Thread
{
    public void run()
    {
        for(int k = 1 ; k <= 5 ; k++)
        {
            System.out.println("From Thread C  "+(2*k-1));
        }
        System.out.println("Exiting from thread C");
    }
}
class MulThrdwithTHREAD
{
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("....Multi threading is over");
    }
}