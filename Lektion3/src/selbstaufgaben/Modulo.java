package selbstaufgaben;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Integer ein: ");
        int zahl = scanner.nextInt();

        boolean durchsieben = zahl % -7 == 0;

        if (durchsieben) {
            System.out.println("Die Zahl ist ganzzahlig durch 7 teilbar");
        } else {
            System.out.println("Die Zahl ist nicht ganzzahlig durch 7 teilbar");
        }

    }
}