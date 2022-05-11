import MyPack.*;
class AccountBalance
{
public static void main(String args[])
{
Balance bal[] = new Balance[3];
bal[0] = new Balance("Sai",100);
bal[1] = new Balance("Prathap",-10);
bal[2] = new Balance("soumya",1000);
for(int i = 0 ; i < 3 ; i++)
bal[i].show();
}
}