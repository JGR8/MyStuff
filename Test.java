import Prog1Tools.IOTools;


public class Test {
    public static void main (String[] args) {
        final double PI = 3.141592;
        double q, w, e, r, t, z, u, h;
        System.out.println("Bitte denn Umfang der Dose in cm angeben");
        u = IOTools.readDouble();
        System.out.println("Bitte die Höhe der Dose in cm angeben");
        h = IOTools.readDouble();
        q = u/PI;
        z = u / 2;
        w = PI * z * z;
        e = u * h;
        r = 2 * PI * z * z + u * h;
        t = PI * z * z * h;
        System.out.println("Der Durchmesser des Dosenbodens Beträgt " + q + "cm" + " Die Fläche des Dosenbodens Beträgt " + w + "cm2");
        System.out.println("Die Grösse der Mantelfläche der Dose beträgt " + e + "cm2" + " Die Grösse der Gesamtfläche der Dose beträgt " + r + "cm2");
        System.out.println("Das Volumen der Dose beträgt " + t + "cm3");
    
    
    }
}
     