public class Auto {
    private String marke;
    private int hubraum;
    private String farbe;
    private String besonderheiten;

    public Auto(String marke, int hubraum, String farbe, String besonderheiten) {
        this.marke = marke;
        this.hubraum = hubraum;
        this.farbe = farbe;
        this.besonderheiten = besonderheiten;
    }

    public String getMarke() {
        return marke;
    }

    public int getHubraum() {
        return hubraum;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getBesonderheiten() {
        return besonderheiten;
    }

    @Override
    public String toString() {
        return "Marke: " + marke + ", Hubraum: " + hubraum + "cc, Farbe: " + farbe + ", Besonderheiten: " + besonderheiten;
    }
}

public class AutoTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", 3000, "Schwarz", "Sportausführung");
        Auto auto2 = new Auto("Audi", 2500, "Weiß", "Quattro-Antrieb");
        Auto auto3 = new Auto("Mercedes", 4000, "Silber", "Luxusausstattung");

        Auto[] autos = {auto1, auto2, auto3};

        if (autos.length == 0) {
            System.out.println("Keine Autos vorhanden.");
            return;
        }

        Auto groessterHubraumAuto = autos[0];
        for (Auto auto : autos) {
            if (auto.getHubraum() > groessterHubraumAuto.getHubraum()) {
                groessterHubraumAuto = auto;
            }
        }

        System.out.println("Auto mit dem größten Hubraum:");
        System.out.println(groessterHubraumAuto);
    }
}


