package selbstpropieren1;
import java.util.Scanner;

public class ModellierungmiteinemAktivitätsdiagramm {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            boolean stop = false;
            int sum = 0;

            System.out.println("Die Eingabe von 0 beendet das Programm und gibt die Summe aus!");

            while (!stop) {
                int x = scanner.nextInt();
                sum += x;

                if (x == 0) {
                    stop = true;
                }
            }

            System.out.println("Summe: " + sum);

            scanner.close();
        }
}
