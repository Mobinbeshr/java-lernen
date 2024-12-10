package Mo2;

import java.util.Scanner;

public class Sinus1 {

    public static double sin(double x) {
        double zeahler = x;
        double nenner = 1.0;
        double summand = 1;
        double result = x;

        for(int i = 3; summand > 1E-15 || summand < -1E-15; i+= 2){
            zeahler *= x * x * (-1);
            nenner *= i * (i-1);
            summand = zeahler/nenner;
            result += summand;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine zahl ein: ");
        double x = sc.nextDouble();

        double erstenFuenf = x - x*x*x/(2*3) + x*x*x*x*x/(2*3*4*5) - x*x*x*x*x*x*x/(2*3*4*5*6*7) + x*x*x*x*x*x*x*x*x/(2*3*4*5*6*7*8*9);
        System.out.println(erstenFuenf);
        System.out.println(sin(x));
    }
}