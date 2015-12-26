import Prog1Tools.IOTools;

public class Quer {
    public static void main (String[] args) {
        double a, b, c, d, e;
        a = IOTools.readDouble("a = ");
        b = IOTools.readDouble("b = ");
        c = IOTools.readDouble("c = ");
        d = IOTools.readDouble("d = ");
        e = a + b + c + d;
        System.out.println(e);
    }
}