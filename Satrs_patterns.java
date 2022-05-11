import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Satrs_patterns {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        n = scan.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern5_2(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        scan.close();
    }
    static void pattern1(int n)
    {
        System.out.println("Pattern 1 ");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");
    }

    static void pattern2(int n)
    {
        System.out.println("Pattern 2 ");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern3(int n)
    {
        System.out.println("Pattern 3");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n-i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern4(int n)
    {
        System.out.println("Pattern 4");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern5(int n)
    {
        System.out.println("Pattern 5");
        for(int i = 0 ; i < n ; i++)
        {
            for( int j = 0 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1 ; i < n ; i++)
        {
            for( int j = 0 ; j < n-i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern5_2(int n)
    {
        System.out.println("Pattern 5 another way of code");
        for(int i = 0 ; i < 2*n-1 ; i++)
        {
            if(i < n)
            {
                for(int j = 0 ; j <= i ; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int j = 0 ; j < 2*n-1 -i ; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        System.out.println("\n\n");
        /*
        Anoher way of coding this :
        for(int row = 0 ; row < 2*n ; row++ )
        {
            int c = row > n ? 2 * n - row : row;
            for(int j = 0 ; j < c ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
    }
   static void pattern6(int n)
    {
        System.out.println("Pattern 6");
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n ;j++)
            {
                if(j <= n-i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern7(int n)
    {
        System.out.println("Pattern 7");
        for(int row = 0 ; row < n ; row++)
        {
            for(int s = 0 ; s < n - row ; s++)
            {
                System.out.print(" ");
            }
            for(int i = 0 ; i <= row ; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern8(int n)
    {
        System.out.println("Pattern 8");
        for(int row = 0 ; row < 2*n ; row++ )
        {
            int c = row > n ? 2 * n - row : row;
            int spaces = n - c;
            for(int i = 0 ; i < spaces ; i++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < c ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern9(int n)
    {
        System.out.println("Pattern 9");
        for(int row = 0 ; row < n ; row++)
        {
            for(int s = 0 ; s < n - row ; s++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j <= row ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern10(int n)
    {
        System.out.println("Pattern 10");
        for(int row = 0 ; row < n ; row++)
        {
            for(int s = 0 ; s < n - row ; s++)
            System.out.print("  ");
            for(int col = row ; col >= 1 ; col-- )
            System.out.print(col + " ");
            for(int col = 2 ; col <= row ; col++)
            System.out.print(col + " ");
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern11(int n)
    {
        System.out.println("Pattern 11");
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n -1; col++) {
                int c = row < col ? row : col;
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    static void pattern12(int n)
    {
        System.out.println("Pattern 12");
        
    }
}