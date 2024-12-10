public class Auto {

        private String marke;
        private String modell;
        private int hubraum;


        public Auto(String marke, String modell, int hubraum) {
            this.marke = marke;
            this.modell = modell;

            if (hubraum > 0) {
                this.hubraum = hubraum;
            } else {
                this.hubraum = 1600;
            }
        }


        public String getMarke() {
            return marke;
        }

        public String getModell() {
            return modell;
        }

        public int getHubraum() {
            return hubraum;
        }


        public void setHubraum(int ccm) {
            if (ccm > 0) {
                this.hubraum = ccm;
            } else {
                System.out.println("Ungültiger Hubraum! Der Wert wird nicht geändert.");
            }
        }


        public static void main(String[] args) {

            Auto auto1 = new Auto("VW", "Golf", 2000);
            System.out.println("Auto 1: " + auto1.getMarke() + " " + auto1.getModell() + " mit " + auto1.getHubraum() + " ccm");


            Auto auto2 = new Auto("Audi", "A4", -500);
            System.out.println("Auto 2: " + auto2.getMarke() + " " + auto2.getModell() + " mit " + auto2.getHubraum() + " ccm");


            auto1.setHubraum(1500);
            System.out.println("Auto 1 nach Änderung: " + auto1.getHubraum() + " ccm");


            auto1.setHubraum(-100);
            System.out.println("Auto 1 nach ungültiger Änderung: " + auto1.getHubraum() + " ccm");
        }
    }

