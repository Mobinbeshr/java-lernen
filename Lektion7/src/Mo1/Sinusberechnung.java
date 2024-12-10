package Mo1;

public class Sinusberechnung {
    public static void main(String[] args) {
        java.util.Locale.setDefault(java.util.Locale.US);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Geben Sie den Wert von x ein: ");
        double x = scanner.nextDouble();
        System.out.println("Sinus(x): " + berechneSinus(x));
        System.out.println("Vergleich mit Math.sin(x): " + Math.sin(x));
    }

    public static double berechneSinus(double x) {
        double ergebnis = 0.0;
        double term; // Jeder Term in der Taylor-Reihe
        int k = 0;   // Der aktuelle Index der Reihe

        do {
            term = Math.pow(-1, k) * Math.pow(x, 2 * k + 1) / fakultaet(2 * k + 1);
            ergebnis += term;
            k++;
        } while (Math.abs(term) > 1e-10); // Abbruchbedingung: Term ist kleiner als 10^-10

        return ergebnis;
    }

    public static long fakultaet(int n) {
        long ergebnis = 1;
        for (int i = 2; i <= n; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    }
}