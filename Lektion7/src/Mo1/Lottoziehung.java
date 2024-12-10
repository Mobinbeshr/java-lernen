package Mo1;
import java.util.Arrays;
import java.util.Random;
public class Lottoziehung {

        public static void main(String[] args) {
            int[] lottozahlen = zieheLottozahlen(6, 49);
            System.out.println("Gezogene Zahlen: " + Arrays.toString(lottozahlen));
            sortiereLottozahlen(lottozahlen);
            System.out.println("Sortierte Zahlen: " + Arrays.toString(lottozahlen));
        }

        public static int[] zieheLottozahlen(int anzahl, int maxZahl) {
            Random random = new Random();
            int[] zahlen = new int[anzahl];
            int i = 0;

            while (i < anzahl) {
                int zahl = random.nextInt(maxZahl) + 1;
                if (!istBereitsVorhanden(zahlen, zahl)) {
                    zahlen[i++] = zahl;
                }
            }
            return zahlen;
        }

        public static boolean istBereitsVorhanden(int[] array, int zahl) {
            for (int wert : array) {
                if (wert == zahl) return true;
            }
            return false;
        }

        public static void sortiereLottozahlen(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

}
