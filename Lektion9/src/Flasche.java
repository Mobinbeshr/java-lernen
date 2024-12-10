public class Flasche {
        private String name;
        private String text;
        private int kapazitaet;
        private int fuellstand;


        public Flasche(String name, String text, int kapazitaet) {
            this.name = name;
            this.text = text;
            if (kapazitaet > 0) {
                this.kapazitaet = kapazitaet;
            } else {
                this.kapazitaet = 1000; // Standardwert von 1 Liter
            }
            this.fuellstand = this.kapazitaet; // Standardmäßig voll
        }


        public String getName() {
            return name;
        }

        public String getText() {
            return text;
        }

        public int getKapazitaet() {
            return kapazitaet;
        }

        public int getFuellstand() {
            return fuellstand;
        }


        public static void print(Flasche flasche) {
            System.out.println("Flasche:");
            System.out.println("Name: " + flasche.getName());
            System.out.println("Text: " + flasche.getText());
            System.out.println("Kapazität: " + flasche.getKapazitaet() + " ml");
            System.out.println("Füllstand: " + flasche.getFuellstand() + " ml");
        }


        public static void main(String[] args) {

            Flasche flasche1 = new Flasche("Apfelsaft", "Frischer Apfelsaft aus der Region", 750);


            Flasche flasche2 = new Flasche("Orangensaft", "100% natürlicher Orangensaft", -500);

            
            print(flasche1);
            System.out.println();
            print(flasche2);
        }
    }


