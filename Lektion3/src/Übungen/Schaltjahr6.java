package Übungen;
import java.util.Scanner;

public class Schaltjahr6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print(" Jahr: ");
            int year = scanner.nextInt();


            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

                System.out.println(year + " Schaltjahr");
            } else {
                System.out.println(year + " kein Schaltjahr ");
            }

            scanner.close();
        }

}
