package Aufgaben;

public class Runden {
        public static int aufOderAbrunden(double zahl) {
            int ganzZahlTeil = (int) zahl;
            double dezimalTeil = zahl - ganzZahlTeil;

            if (dezimalTeil >= 0.5) {
                return ganzZahlTeil + 1;
            } else {
                return ganzZahlTeil;
            }
        }

        public static double rundenMitNachkommastellen(double zahl, int nachkommastellen) {
            double faktor = potenz(10, nachkommastellen);
            double verschobeneZahl = zahl * faktor;
            int ganzZahlTeil = (int) verschobeneZahl;
            double dezimalTeil = verschobeneZahl - ganzZahlTeil;

            if (dezimalTeil >= 0.5) {
                ganzZahlTeil += 1;
            }
            return (double) ganzZahlTeil / faktor;
        }

        private static double potenz(double basis, int exponent) {
            double ergebnis = 1;
            for (int i = 0; i < exponent; i++) {
                ergebnis *= basis;
            }
            return ergebnis;
        }

        public static void main(String[] args) {
            System.out.println(aufOderAbrunden(3.2));
            System.out.println(aufOderAbrunden(3.5));


            System.out.println(rundenMitNachkommastellen(3.14159, 2));
            System.out.println(rundenMitNachkommastellen(3.14659, 2));
        }
    }

