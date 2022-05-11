public class DataRace extends Thread{
    static int x;
    public void run()
    {
        for(int i = 0 ; i < 100000 ; i++)
        {
            x = x+1;
            x = x-1;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        x  = 0;
        for(int i = 0 ; i < 10 ; i++)
        new DataRace().start();
        System.out.println("From main : "+x);
    }
}
