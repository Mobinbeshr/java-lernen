package Mo3;

public class Eurostück3 {

    public static void main(String[] args) {
        final int durchlaeufe = 10000;
        int anzahlSchublade3 = 0;
        int anzahlNichtInSchublade3 = 0;

        for (int i = 0; i < durchlaeufe; i++) {

            boolean EuroInSchreibtisch = Math.random() < 0.7;

            boolean EuroInSchublade1_2 = Math.random() < 0.66;

            if (!EuroInSchreibtisch) {

                if (EuroInSchublade1_2) {

                    anzahlNichtInSchublade3++;
                } else {

                    anzahlSchublade3++;
                }
            } else {

                anzahlNichtInSchublade3++;
            }
        }


        double prozentSchublade3 = anzahlSchublade3 / (double) anzahlNichtInSchublade3 * 100;

        System.out.printf("Prozent der Euros in Schublade 3: %.2f%%\n", prozentSchublade3);
    }
}

