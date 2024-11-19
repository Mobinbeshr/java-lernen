package selbstaufgaben;

import java.util.Scanner;

public class Einzelzeichen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String eingabe = scanner.nextLine();
            char einzelzeichen = eingabe.charAt(0);


            boolean grossbuchstabe = einzelzeichen >= 65 && einzelzeichen <= 90;
            boolean von_0_bis_9 = einzelzeichen >= 48 && einzelzeichen <= 57;
            boolean von_a_bis_f = einzelzeichen >= 97 && einzelzeichen <= 102;
            boolean von_A_bis_F = einzelzeichen >= 65 && einzelzeichen <= 70;

            boolean istHexadezimal = von_0_bis_9 || von_a_bis_f || von_A_bis_F;
            boolean isBinary = einzelzeichen == 48 || einzelzeichen == 49;
            boolean istOktal = einzelzeichen >= 48 && einzelzeichen <= 55;

            if (grossbuchstabe) {
                System.out.println("Großbuchstabe");
            }

            if (istHexadezimal) {
                System.out.println("Hexadezimale Ziffer");
            }

            if (isBinary) {
                System.out.println("Binäre Ziffer");
            }

            if (istOktal) {
                System.out.println("Oktale Ziffer");
            }

        }
}
