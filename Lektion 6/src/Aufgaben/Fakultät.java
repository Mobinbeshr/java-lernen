package Aufgaben;
import java.util.Scanner;

public class Fakultät {


        public static long berechneFakultaet(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Fakultät ist nur für nicht negative Zahlen definiert.");
            }
            long ergebnis = 1;
            for (int i = 1; i <= n; i++) {
                ergebnis *= i;
            }
            return ergebnis;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Bitte geben Sie eine Zahl ein: ");
            int zahl = scanner.nextInt();

            try {

                long fakultaet = berechneFakultaet(zahl);
                System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            scanner.close();
        }
    }
