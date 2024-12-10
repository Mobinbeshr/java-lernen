package Mo1;
import java.util.Random;

public class EuroStück {

        public static void main(String[] args) {
            int durchlaeufe = 10000;
            int erfolge = 0;
            Random random = new Random();

            for (int i = 0; i < durchlaeufe; i++) {
                boolean euroExistiert = random.nextBoolean();
                if (euroExistiert) {
                    int schublade = random.nextInt(3);
                    if (schublade == 2) {
                        erfolge++;
                    }
                }
            }

            double wahrscheinlichkeit = (double) erfolge / durchlaeufe;
            System.out.println("Wahrscheinlichkeit: " + wahrscheinlichkeit);
        }

}
