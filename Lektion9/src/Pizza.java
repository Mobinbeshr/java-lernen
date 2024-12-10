import java.util.ArrayList;
import java.util.List;

class Pizza {

        private String name;
        private List<DurchmesserPreis> durchmesserPreisKombinationen;


        public Pizza(String name) {
            this.name = name;
            this.durchmesserPreisKombinationen = new ArrayList<>();
        }


        public void addDurchmesserPreis(int durchmesser, double preis) {
            durchmesserPreisKombinationen.add(new DurchmesserPreis(durchmesser, preis));
        }


        public DurchmesserPreis bestesPreisLeistungsverhaeltnis() {
            if (durchmesserPreisKombinationen.isEmpty()) {
                return null;
            }

            DurchmesserPreis besteKombination = durchmesserPreisKombinationen.get(0);
            double bestesVerhaeltnis = besteKombination.preisLeistungsverhaeltnis();

            for (DurchmesserPreis dp : durchmesserPreisKombinationen) {
                double aktuellesVerhaeltnis = dp.preisLeistungsverhaeltnis();
                if (aktuellesVerhaeltnis > bestesVerhaeltnis) {
                    bestesVerhaeltnis = aktuellesVerhaeltnis;
                    besteKombination = dp;
                }
            }
            return besteKombination;
        }

        public String getName() {
            return name;
        }
    }


    class DurchmesserPreis {
        private int durchmesser;
        private double preis;

        public DurchmesserPreis(int durchmesser, double preis) {
            this.durchmesser = durchmesser;
            this.preis = preis;
        }

        public double preisLeistungsverhaeltnis() {
            // Preis-Leistungs-Verhältnis: Fläche (∝ durchmesser²) geteilt durch Preis
            return (Math.PI * Math.pow(durchmesser / 2.0, 2)) / preis;
        }

        @Override
        public String toString() {
            return "Durchmesser: " + durchmesser + " cm, Preis: " + preis + " €, Preis-Leistungs-Verhältnis: " + preisLeistungsverhaeltnis();
        }
    }

    // Hauptklasse mit main-Methode
    class PizzaTest {
        public static void main(String[] args) {
            // Pizzen erstellen
            Pizza pizza1 = new Pizza("Margherita");
            pizza1.addDurchmesserPreis(20, 5.0);
            pizza1.addDurchmesserPreis(30, 8.0);

            Pizza pizza2 = new Pizza("Salami");
            pizza2.addDurchmesserPreis(25, 6.5);
            pizza2.addDurchmesserPreis(35, 10.0);

            Pizza pizza3 = new Pizza("Hawaii");
            pizza3.addDurchmesserPreis(22, 7.0);
            pizza3.addDurchmesserPreis(28, 9.5);

            Pizza pizza4 = new Pizza("Vegetarisch");
            pizza4.addDurchmesserPreis(24, 6.0);
            pizza4.addDurchmesserPreis(32, 11.0);

            Pizza pizza5 = new Pizza("Diavola");
            pizza5.addDurchmesserPreis(26, 8.5);
            pizza5.addDurchmesserPreis(30, 12.0);

            // Beste Preis-Leistungs-Verhältnisse berechnen
            List<Pizza> pizzen = List.of(pizza1, pizza2, pizza3, pizza4, pizza5);
            for (Pizza pizza : pizzen) {
                DurchmesserPreis beste = pizza.bestesPreisLeistungsverhaeltnis();
                System.out.println("Beste Kombination für Pizza " + pizza.getName() + ": " + beste);
            }
        }
    }

