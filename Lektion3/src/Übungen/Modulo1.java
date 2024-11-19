package Übungen;
import java.util.Scanner;


public class Modulo1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("X: ");
            int number = scanner.nextInt();

            if (isDivisibleBySeven(number)) {
                System.out.println("der Zahl kann durch 7 :");
            } else {
                System.out.println("der Zahl kann nicht durch 7 :");
            }

            scanner.close();
        }

        public static boolean isDivisibleBySeven(int num) {
            return num % 7 == 0;
        }

}
