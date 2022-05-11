import java.util.*;
public class SimpleArratList {
    public static void main(String[] args) {
        int sum = 0 ;
        float avg = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> l = new ArrayList<Integer>();
        System.out.println("Enter the input : ");
        while(scan.hasNextInt())
        {
            l.add(scan.nextInt());
        }
        for(int i = 0 ; i < l.size() ; i++)
        {
            sum += l.get(i);
        }
        avg = sum/l.size();
        System.out.println("The average is : " + avg);
        scan.close();
    }
}
