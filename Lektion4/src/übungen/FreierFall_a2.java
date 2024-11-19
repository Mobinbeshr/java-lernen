package übungen;
import java.util.Scanner;
public class FreierFall_a2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final double g = 9.80665;

            System.out.print("Bitte Falldauer in Sekunden eingeben: ");
            int fallDauer = scanner.nextInt();

            for (int t = 1; t <= fallDauer; t++) {
                double strecke = 0.5 * g * t * t;
                System.out.printf("Zeit: %d Sekunden: Zurückgelegte Strecke: %.4f m\n", t, strecke);
            }

            scanner.close();
        }

}
