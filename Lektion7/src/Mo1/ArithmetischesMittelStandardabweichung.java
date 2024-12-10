package Mo1;
import java.util.Scanner;
public class ArithmetischesMittelStandardabweichung {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Anzahl der Werte: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Fehler: Anzahl muss größer als 0 sein.");
                return;
            }

            double[] werte = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Wert: ");
                werte[i] = scanner.nextDouble();
            }

            double mittelwert = berechneMittelwert(werte);
            double standardabweichung = berechneStandardabweichung(werte, mittelwert);
            double min = findeMinimum(werte);
            double max = findeMaximum(werte);

            System.out.println("Kleinster Wert: " + min);
            System.out.println("Größter Wert: " + max);
            System.out.println("Arithmetischer Mittelwert: " + mittelwert);
            System.out.println("Standardabweichung: " + standardabweichung);
        }

        public static double berechneMittelwert(double[] werte) {
            double summe = 0;
            for (double wert : werte) {
                summe += wert;
            }
            return summe / werte.length;
        }

        public static double berechneStandardabweichung(double[] werte, double mittelwert) {
            double summe = 0;
            for (double wert : werte) {
                summe += Math.pow(wert - mittelwert, 2);
            }
            return Math.sqrt(summe / werte.length);
        }

        public static double findeMinimum(double[] werte) {
            double min = werte[0];
            for (double wert : werte) {
                if (wert < min) min = wert;
            }
            return min;
        }

        public static double findeMaximum(double[] werte) {
            double max = werte[0];
            for (double wert : werte) {
                if (wert > max) max = wert;
            }
            return max;
        }

}
