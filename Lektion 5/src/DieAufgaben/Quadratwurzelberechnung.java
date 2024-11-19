package DieAufgaben;
import java.util.Scanner;
public class Quadratwurzelberechnung {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Zahl: ");
            double zahl = scanner.nextDouble();
            scanner.close();

            double wurzel = berechneWurzel(zahl);
            System.out.printf("Quadratwurzel von %.2f ist ungefähr %.5f%n", zahl, wurzel);
        }

        public static double berechneWurzel(double zahl) {
            double epsilon = 1e-5;
            double schätzung = zahl / 2;
            double vorherigeSchätzung;

            do {
                vorherigeSchätzung = schätzung;
                schätzung = (schätzung + zahl / schätzung) / 2;
            } while (Math.abs(schätzung - vorherigeSchätzung) >= epsilon);

            return schätzung;
        }
    }

