import java.io.*;
import java.util.Scanner;

public class SelectionSort 
{
    public static void main(String[] args) {
        
        System.out.println("Enter size of the array  : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int A[] = new int[10];
        System.out.println("Enter the elements of array one by one : ");
        for(int i = 0 ; i < size ; i++)
        {
            A[i] = scan.nextInt();
        }
        //selection sort is a method of sorting arrays , here we select the least element of the array and swap it to
        // front postion of the array each pass will move one least element to the startpos of the array and startpos is
        //updated for each new pass.
        //By this technique , applying the loop over the array for passes(each pass set min element to stratpos) we find minelement
        //in every pass and swap it with the start elemnt.
        for(int startpos = 0 ; startpos < size ; startpos++) //this loops over the array 'size' times
        {
            int minpos = startpos;
            for(int i = startpos ; i < size ; i++) //This loops over the array's new segment (i.e., new startpos to n-1)
            {
                if(A[i] < A[minpos])
                minpos = i;  //Used to find the min element
            }
            int temp  = A[startpos];
            A[startpos] = A[minpos]; //swapping the min elemnt with first element
            A[minpos] = temp;

        }
        System.out.println("The sorted array is : ");
        for(int i = 0 ; i < size ; i++)
        System.out.print(A[i] + " ");
        scan.close();
    }
}