import java.lang.Math;
public class nestedCircle {
    static double x,y,r;
    nestedCircle(double r){
        this.r = r;
    }
    public static class Point{
        double x,y;
        void display(){
            System.out.println("(x,y) : ("+this.x+","+this.y+")");
        }
        Point(double a , double b)
        {
            this.x = a;
            this.y = b;
        }
    }
    public Boolean isInside(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        double distance = Math.sqrt((dx*dx)+(dy*dy));
        if(distance < r) return true;
        else return false;
    }
   public static void main(String[] args) {
        nestedCircle a = new nestedCircle(2.0);
        Point pa = new Point(1.0,2.0);
         pa.display();
         System.out.println("Radius of circle"+a.r);
         System.out.println("pa is inside a? " + a.isInside(pa));
    }
}
