import java.util.Scanner;
class Palindrome
{
    static int reverse(int num)
    {
        int rev=0;
        while(num > 0)
        {
            rev = rev*10 + num%10;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find whethre a given number is a palindrome ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("The number is palindrome : " + (num == reverse(num)));
    }
}