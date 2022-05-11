public class SLEEP extends Thread {
    public void run()
    {
        for(int i = 0 ; i < 3 ; i++)
        {
            try{
                sleep((int)(Math.random()*50000));
                System.out.println("Slept");
            }
            catch(InterruptedException e)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        new SLEEP().start();
        new SLEEP().start();
        System.out.println("Done with this");
    }
}
