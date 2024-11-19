package DieAufgaben;

public class ReihenwertBerechnung {
        public static void main(String[] args) {
            double epsilon= 1e-5;
            double reihe = 0;
            int k = 1;
            double term;

            do {
                term = 1 /Math.pow(k,2);
                reihe += term;
                System.out.printf("Zwischenergebnis: %.5f%n", reihe);
                k++;
            } while (term >= epsilon);

            System.out.printf("Endergebnis: %.5f%n", reihe);
        }

}
