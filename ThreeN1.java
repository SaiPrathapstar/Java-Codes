import java.util.*;
class ThreeN1
{
public static void main(String args[])
{
int counter = 0,num;
Scanner scan = new Scanner(System.in);
System.out.print("Enter a Positive integer : ");
num = scan.nextInt();
while(num < 0)
{
System.out.println("Error! Please enter a positive number : ");
num = scan.nextInt();
}
System.out.print("The numbers in the Series are : ");
while(num!=1)
{
System.out.print(num + "   ");
counter++;
if(num % 2 == 0)
{
num = num / 2;
}
else
{
num = 3*num+1;
}
}
System.out.println("1");
counter = counter + 1;
System.out.println("Total numbers generated are : " + counter);
}
}