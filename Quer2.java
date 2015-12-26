import Prog1Tools.IOTools;

public class Quer2 {
    public static void main (String[] args) {
        int a, b, c, d;
        System.out.println("Dieses Programm berechnet die Quersumme einer Zahl bis max. 9999");
        a = IOTools.readInteger("Bitte die erste Stelle der Zahl eingeben = ");
        if (a < 10) {
            b = IOTools.readInteger("Bitte die zweite Stelle der Zahl eingeben = ");
            if (b < 10) {
                c = IOTools.readInteger("Bitte die dritte Stelle der Zahl eingeben = ");
                if (c < 10) {
                    d = IOTools.readInteger("Bitte die vierte Stelle der Zahl eingeben = ");
                    System.out.println(a + b + c + d);
                }
            }
        }
        else 
        System.out.println("Bitte nur eine Stelle");
    }
}
        