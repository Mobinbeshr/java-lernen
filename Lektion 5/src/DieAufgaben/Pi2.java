package DieAufgaben;
import java.util.Scanner;
public class Pi2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Wie viele Rechtecke: ");
            float rechtecke = sc.nextInt();
            double ergebnis = 0;

            for(int i = 1; i < rechtecke; i++) {
                double teil = Math.sqrt(1 - (i / rechtecke) * (i / rechtecke));
                ergebnis += teil;
            }

            System.out.println((ergebnis / rechtecke) * 4);
        }
}
