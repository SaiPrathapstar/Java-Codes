public class rand
{
    public static void main(String[] args) {
        Float f1 = new Float("3.0");
        int x = f1.intValue();
        byte b = f1.byteValue();
        double d = f1.doubleValue();
        System.out.println(x+b+d);
    }
}