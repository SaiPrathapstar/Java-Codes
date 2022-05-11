public class GCD {
    int m , n;
    int gcd(int m, int n){
        if (n>m) return gcd(n,m);
        else if (m == n) return m;
        else if(n ==0) return m;
        else if(n == 1) return n;
        return gcd(n,m%n);
    }
    public static void main(String[] args) {
        GCD g = new GCD();
        g.m = Integer.parseInt(args[0]);
        g.n = Integer.parseInt(args[1]);
        System.out.println("GCD of " + g.m + " and "+ g.n + " is " + g.gcd(g.m,g.n));
    }
}
