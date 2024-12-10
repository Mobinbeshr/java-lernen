package Mo2;
import java.util.Scanner;
public class Arithmetisch1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Anzahl der Werte: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Fehler: Anzahl muss größer als 0 sein.");
                return;
            }

            double[] werte = new double[n];
            double summe = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                System.out.print("Wert " + (i + 1) + ": ");
                werte[i] = scanner.nextDouble();
                summe += werte[i];
                if (werte[i] < min) min = werte[i];
                if (werte[i] > max) max = werte[i];
            }
            scanner.close();

            double mittelwert = summe / n;
            double varianz = 0;
            for (double wert : werte) varianz += Math.pow(wert - mittelwert, 2);
            double standardabweichung = Math.sqrt(varianz / n);

            System.out.printf("Min: %.2f, Max: %.2f, Mittelwert: %.2f, Standardabweichung: %.2f%n",
                    min, max, mittelwert, standardabweichung);
        }
    }

