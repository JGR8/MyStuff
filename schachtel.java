import Prog1Tools.IOTools;

public class schachtel {
    public static void main (String[] args) {
        int i, b;
        i = IOTools.readInteger("Anzahl der Zeilen = ");
        b = 0;
        for (; b != i; b++) {
        System.out.println();
          for (int t = -1; t != b; t++) {
          System.out.print("*");
          continue;
         }
        }
           System.out.println();
    }
}