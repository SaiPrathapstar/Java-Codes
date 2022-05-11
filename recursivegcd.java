public class recursivegcd {
    static int gcd(int m,int n)
    {
        if (n > m) return gcd(n,m);
        else if (n == m) return m;
        else if(n == 0) return m;
        else if(n == 1) return n;
        return gcd(n , m%n);

    }
    public static void main(String[] args) {
        int m  = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.printf("The GCD of %d and %d is = %d",m,n,gcd(m,n));
    }
}
