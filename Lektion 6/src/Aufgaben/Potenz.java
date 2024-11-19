package Aufgaben;

import java.util.Scanner;

public class Potenz {

    public static double berechnePotenz(double basis, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent > 0) {
            return basis * berechnePotenz(basis, exponent - 1);
        } else {
            return 1 / berechnePotenz(basis, -exponent);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bitte geben Sie die Basis ein: ");
        double basis = scanner.nextDouble();

        System.out.print("Bitte geben Sie den Exponenten ein: ");
        int exponent = scanner.nextInt();


        double ergebnis = berechnePotenz(basis, exponent);
        System.out.println(basis + " hoch " + exponent + " ist: " + ergebnis);

        scanner.close();
    }
}

