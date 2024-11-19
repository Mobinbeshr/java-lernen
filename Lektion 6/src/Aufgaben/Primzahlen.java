package Aufgaben;

public class Primzahlen {
    public static boolean istPrimzahl(int zahl) {
        if (zahl <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Primzahlprüfung für Zahlen von 1 bis 20:");

        for (int i = 1; i <= 20; i++) {
            if (istPrimzahl(i)) {
                System.out.println(i + " ist eine Primzahl.");
            } else {
                System.out.println(i + " ist keine Primzahl.");
            }
        }
    }
}

