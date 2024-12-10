public class Raumbelegung {

        private final String kennung;
        private final int maxStudenten;
        private boolean belegt;


        public Raumbelegung(String kennung, int maxStudenten) {
            this.kennung = kennung;
            this.maxStudenten = maxStudenten;
            this.belegt = false;
        }


        public String getKennung() {
            return kennung;
        }


        public int getMaxStudenten() {
            return maxStudenten;
        }


        public boolean isBelegt() {
            return belegt;
        }


        public void belegen() {
            if (!belegt) {
                belegt = true;
                System.out.println("Raum " + kennung + " wurde erfolgreich belegt.");
            } else {
                System.out.println("Raum " + kennung + " ist bereits belegt.");
            }
        }


        public void freigeben() {
            if (belegt) {
                belegt = false;
                System.out.println("Raum " + kennung + " wurde freigegeben.");
            } else {
                System.out.println("Raum " + kennung + " ist bereits frei.");
            }
        }


        public static void main(String[] args) {
            // Räume erstellen
            Raumbelegung raum1 = new Raumbelegung("I.2.1", 30);
            Raumbelegung raum2 = new Raumbelegung("I.2.15", 50);

            // Belegungsstatus abfragen
            System.out.println("Raum " + raum1.getKennung() + " belegt? " + raum1.isBelegt());
            System.out.println("Raum " + raum2.getKennung() + " belegt? " + raum2.isBelegt());

            // Raum I.2.1 belegen
            raum1.belegen();

            // Belegungsstatus erneut abfragen
            System.out.println("Raum " + raum1.getKennung() + " belegt? " + raum1.isBelegt());
            System.out.println("Raum " + raum2.getKennung() + " belegt? " + raum2.isBelegt());
        }
    }

