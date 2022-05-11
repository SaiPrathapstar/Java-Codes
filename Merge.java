import java.util.*;
public class Merge {
    public static void main(String[] args) {
        int m , n;
        System.out.println("Enter the size of the first list : ");
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        System.out.println("Enter the size of the second list : ");
        n = scan.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        System.out.println("Enter the elements of the fisrt sorted list : ");
        for(int i = 0 ; i < m ; i++)
        a[i] = scan.nextInt();
        System.out.println("Enter the elements of the second soretd list : ");
        for(int i = 0 ; i < n ; i++)
        b[i] = scan.nextInt();
        int c[] = new int[m+n];
        int i = 0 , j = 0;
        for(int k = 0 ; k < m+n ; k++)
        {
            if( i == m)
            {
                c[k] = b[j];
                j++;
            }
            else if ( j == n)
            {
                c[k] = a[i];
                i++;
            }
            else if( a[i] < b[j])
            {
                c[k] = a[i];
                i++;
            }
            else
            {
                c[k] = b[j];
                j++;
            }
        }
        System.out.println("The sorted array is : ");
        for( int k = 0 ; k < m+n ; k++)
        System.out.print(c[k] + " ");
        scan.close();
    }
}
