package übungen;
import java.util.Scanner;

public class Primzahl_a3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bitte zu untersuchende Zahl eingeben: ");
            int zahl = scanner.nextInt();


            if (istPrimzahl(zahl)) {
                System.out.println("Untersuchte Zahl ist eine Primzahl!");
            } else {
                System.out.println("Untersuchte Zahl ist keine Primzahl!");
            }

            System.out.println("Primzahlen bis " + zahl + ":");
            for (int i = 2; i <= zahl; i++) {
                if (istPrimzahl(i)) {
                    System.out.print(i + " ");
                }
            }
    }

        public static boolean istPrimzahl(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
}


