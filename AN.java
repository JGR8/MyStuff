import static Prog1Tools.IOTools.*;


public class AN {
    public static void main (String[] args) {
        String n;
        int a, b, c, d, e;
        System.out.println("Bitte Namen Eingeben bitte zusammen schreiben");
        n = readString();
        System.out.println("Bitte Alter Eingeben");
        a = readInteger();
        a = (a * 365);
        c = (a * 24);
        d = (a * 24 * 60);
        e = (a * 24 * 60 * 60);
        b = 2;
        if (b >= 1) {
            System.out.println("Willkommen " + n + " Sie sind " + a + " Tage " + c + " Stunden " + d + " Minuten und " + e + " Sekunden alt");
        }
    }
}
        