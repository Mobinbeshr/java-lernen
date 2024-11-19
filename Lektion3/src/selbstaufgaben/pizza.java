package selbstaufgaben;
import java.util.Scanner;
public class pizza{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Pizza 1
        System.out.print("Pizza 1 Durchmesser: ");
        int pizza_1_durchmesser = scanner.nextInt();
        System.out.print("Pizza 1 Preis: ");
        int pizza_1_preis = scanner.nextInt();

        int pizza_1_radius = pizza_1_durchmesser / 2;
        double pizza_1_flaeche = pizza_1_radius * pizza_1_radius * Math.PI;

        // Pizza 2
        System.out.print("Pizza 2 Durchmesser: ");
        int pizza_2_durchmesser = scanner.nextInt();
        System.out.print("Pizza 2 Preis: ");
        int pizza_2_preis = scanner.nextInt();

        int pizza_2_radius = pizza_2_durchmesser / 2;
        double pizza_2_flaeche = pizza_2_radius * pizza_2_radius * Math.PI;

        if (pizza_1_flaeche / pizza_1_preis > pizza_2_flaeche / pizza_2_preis) {
            System.out.println("Pizza 1 hat das bessere Preisverhältnis");
        } else if (pizza_1_flaeche / pizza_1_preis < pizza_2_flaeche / pizza_2_preis) {
            System.out.println("Pizza 2 hat das bessere Preisverhältnis");
        } else {
            System.out.println("Das Preisverhältnis ist bei beiden gleich");
        }

    }
}