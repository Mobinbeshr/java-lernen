package DieAufgaben;
import java.util.Scanner;
public class Potenz {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Basis b: ");
            double b = scanner.nextDouble();
            System.out.print("Exponent n: ");
            int n = scanner.nextInt();
            scanner.close();
            double result = potenz(b, n);
            System.out.printf("%.2f^%d = %.5f%n",b ,n, result);
        }

        public static double potenz(double b, int n) {
            double ergebnis = 1;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    ergebnis *= b;
                }
            } else if (n < 0) {
                for (int i = 0; i < -n; i++) {
                    ergebnis /= b;
                }
            }
            return ergebnis;
        }
    }

