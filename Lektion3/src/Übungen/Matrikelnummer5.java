package Übungen;
import java.util.Scanner;

public class Matrikelnummer5 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Matrikelnummer : ");
            String matriculationNumber = scanner.nextLine();

            if (matriculationNumber.matches("(50|51|61)\\d{5}")) {
                System.out.println("Die Matrikelnummer ist gültig");
            } else {
                System.out.println("Die Matrikelnummer ist ungültig ");
            }

            scanner.close();
        }


}
