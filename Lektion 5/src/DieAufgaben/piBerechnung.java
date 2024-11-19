package DieAufgaben;
import java.util.Scanner;

public class piBerechnung {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Anzahl der Rechtecke: ");
            int rechtecke = scanner.nextInt();
            scanner.close();

            double pi = berechnePi(rechtecke);
            System.out.printf("Annäherung an π mit  Rechtecken: 5f ", rechtecke, pi);
        }

        public static double berechnePi(int rechtecke) {
            double breite = 1.0 / rechtecke;
            double summe = 0.0;

            for (int i = 0; i < rechtecke; i++) {
                double x = (i + 0.5) * breite;
                summe += 4.0 / (1.0 + x * x);
            }

            return summe * breite;
        }
    }