import java.util.*;
public class SJF 
{
public static void main(String args[])
{
int i , j , k , t , n;
float avgwt = 0,avgtt = 0;
System.out.println("Enter the number of process : ");
Scanner scan = new Scanner(System.in);
n = scan.nextInt();
int p[] = new int[n];
int bt[] = new int[n];
int wt[] = new int[n];
int tt[] = new int[n];
System.out.println("Enter the process numbers one by one : ");
for(i = 0 ; i < n ; i++)
p[i] = scan.nextInt();
System.out.println("Enter the burst time of the process : ");
for(i = 0 ; i < n ; i++)
bt[i] = scan.nextInt();
for(i = 0 ; i < n ; i++)
{
for(j = 0 ; j < n ; j++)
{
if(bt[i] > bt[j])
{
t = bt[i];
bt[i] = t;
k = p[i];
p[j] = k;
}
}
}
wt[0] = 0;
for(i = 1 ; i < n ; i++)
wt[i] = wt[i-1] + bt[i];
for(i = 0 ; i < n ;i++)
tt[i] = tt[i] + wt[i];
for(i = 0 ; i < n ; i++)
{
avgwt += wt[i];
avgtt += tt[i];
}
avgwt/=n;
avgtt/=n;
System.out.println("pname :  btime :  ttime :  wtime :");
for( i = 0 ; i < n ;i++)
System.out.println(p[i]+"     \t" + bt[i]+"     \t" + tt[i]+"    \t" + wt[i]+"    \t");
System.out.println("The average waiting time is     : " + avgwt);
System.out.println("The average turn around time is : " + avgtt);
System.out.println(p[0] + p[1] + p[2]);
scan.close();
}
}