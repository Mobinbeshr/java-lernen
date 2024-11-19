package Übungen;
import java.util.Scanner;

public class EInzelzeichen3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a single character: ");
            char character = scanner.next().charAt(0);
            boolean matched = false;
            if (Character.isUpperCase(character)) {
                System.out.println("Großbuchstabe");
                matched = true;
            }
            if (Character.digit(character, 16) != -1) {
                System.out.println("Hexadezimale Ziffer");
                matched = true;
            }
            if (character == '0' || character == '1') {
                System.out.println("binäre Ziffer");
                matched = true;
            }
            if (Character.digit(character, 8 ) != -1) {
                System.out.println("oktale Ziffer");
                matched = true;
            }
            if (!matched) {
                System.out.println("Unbekannt");
            }

            scanner.close();
        }

}
