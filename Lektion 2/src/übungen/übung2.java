package übungen;

import java.util.Scanner;

public class übung2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("p: ");
        double p = sc.nextDouble();
        System.out.print("q: ");
        double q = sc.nextDouble();
        double d = (p / 2) * (p / 2) - q;

        if (d >= 0) {
            double x1 = -p / 2 + Math.sqrt(d);
            double x2 = -p / 2 - Math.sqrt(d);
            System.out.println("Lösungen: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("Keine Lösung");
        }

        sc.close();
    }
}
