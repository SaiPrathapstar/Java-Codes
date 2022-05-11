class A implements Runnable
{
    public void run()
    {
        for(int i = 1 ; i < 5 ; i++)
        System.out.println(-1*i);
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int j = 1  ; j < 5 ; j++)
        {
            System.out.println(2*j);
        }
    }
}
class C implements Runnable
{
    public void run()
    {
        for(int k = 1 ; k <5 ; k++)
        System.out.println(2*k-1);
    }
}
public class MulThrdwithRUNNABLE {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        B b = new B();
        Thread t2 = new Thread(b);
        //C c = new C();
        Thread t3 = new Thread(new C());
        t1.start();
        t2.start();
        t3.start();
    }
}
