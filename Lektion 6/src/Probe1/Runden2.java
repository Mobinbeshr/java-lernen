package Probe1;

public class Runden2 {


        public static int rundenAufOderAb(double zahl) {
            if (zahl - (int) zahl >= 0.5) {
                return (int) zahl + 1;
            } else {
                return (int) zahl;
            }
        }


        public static double rundeNachkommastellen(double zahl, int nachkommastellen) {

            double faktor = Math.pow(10, nachkommastellen);


            double verschoben = zahl * faktor;


            int gerundet = verschoben - (int) verschoben >= 0.5 ? (int) verschoben + 1 : (int) verschoben;


            return gerundet / faktor;
        }

        public static void main(String[] args) {

            System.out.println(rundenAufOderAb(3.2)); // Ausgabe: 3
            System.out.println(rundenAufOderAb(3.5)); // Ausgabe: 4


            System.out.println(rundeNachkommastellen(3.14159, 2)); // Ausgabe: 3.14
            System.out.println(rundeNachkommastellen(3.145, 2)); // Ausgabe: 3.15
        }
    }

