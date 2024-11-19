package selbstpropieren1;
import java.util.Scanner;
public class Potenz2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bitte geben sie b (double) ein:");
            double b = scanner.nextDouble();
            System.out.println("Bitte geben sie n (int) ein:");
            int n = scanner.nextInt();
            double ergebnis = 1;
            int absN = n < 0 ? -1 * n : n;

            for (int i = 0; i < absN; i++) {
                ergebnis *= b;
            }

            if (n < 0) {
                 ergebnis= 1 / ergebnis;
            }
            System.out.println(ergebnis);

            scanner.close();
        }
    }
