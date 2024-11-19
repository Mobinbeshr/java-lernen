import java.util.Scanner;

public class übung1{
    public static void main(String[] args) {
        double r = new Scanner(System.in).nextDouble();
        System.out.printf("Fläche: %.2f\nUmfang: %.2f\nVolumen: %.2f\n",
                Math.PI * r * r, 2 * Math.PI * r, (4.0 / 3.0) * Math.PI * Math.pow(r, 3));
    }
}

