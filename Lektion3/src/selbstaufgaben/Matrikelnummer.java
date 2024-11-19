package selbstaufgaben;
import java.util.Scanner;


public class Matrikelnummer {
        public static void main(String[] args) throws NumberFormatException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Geben Sie Ihre Matrikelnummer ein: ");
            String matrikelnummer = scanner.nextLine();
            int matrikelNummerInt = Integer.valueOf(matrikelnummer);

            char ersteZahl = matrikelnummer.charAt(0);
            char zweiteZahl = matrikelnummer.charAt(1);

            boolean ist50 = ersteZahl == (char) 53 && zweiteZahl == (char) 48;
            boolean ist51 = ersteZahl == (char) 53 && zweiteZahl == (char) 49;
            boolean ist61 = ersteZahl == (char) 54 && zweiteZahl == (char) 49;
            boolean ist7_ziffern = matrikelnummer.length() == 7;

            if (ist50||ist51|| ist61 && ist7_ziffern)
                System.out.println("Die Matrikelnummer ist gültig");
            else
                System.out.println("Die Matrikelnummer ist nicht gültig");
        }

}
