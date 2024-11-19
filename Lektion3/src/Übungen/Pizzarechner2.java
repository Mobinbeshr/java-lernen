package Übungen;
import java.util.Scanner;

public class Pizzarechner2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Durchmesser der ersten Pizza ein (in cm): ");
            int diameter1 = scanner.nextInt();
            System.out.print(" Preis der ersten Pizza ein: ");
            double price1 = scanner.nextDouble();
            System.out.print(" Durchmesser der zweiten Pizza ein (in cm): ");
            int diameter2 = scanner.nextInt();
            System.out.print(" Preis der zweiten Pizza ein: ");
            double price2 = scanner.nextDouble();

            double radius1 = diameter1 / 2.0;
            double radius2 = diameter2 / 2.0;
            double area1 = Math.PI * Math.pow(radius1, 2);
            double area2 = Math.PI * Math.pow(radius2, 2);
            double value1 = area1 / price1;
            double value2 = area2/ price2 ;

            if (value1 > value2) {
                System.out.println("Pizza 1 hat das bessere Preis");
            } else if (value1 < value2) {
                System.out.println("Pizza 2 hat das bessere Preis");
            } else {
                System.out.println("Beide Pizzen haben das gleiche Preis");
            }

            scanner.close();
        }


}
