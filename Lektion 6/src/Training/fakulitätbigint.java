package Training;
import java.math.BigInteger;
import java.util.Scanner;
public class fakulitätbigint {
    public static BigInteger berechneFakultaet(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Fakultät ist nur für nicht-negative Zahlen definiert.");
            }

            BigInteger ergebnis = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                ergebnis = ergebnis.multiply(BigInteger.valueOf(i));
            }
            return ergebnis;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bitte geben Sie eine Zahl ein: ");
            int zahl = scanner.nextInt();

            try {
                BigInteger fakultaet = berechneFakultaet(zahl);
                System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            scanner.close();
        }
    }
