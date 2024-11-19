package Aufgaben;

public class Sprünge {


    public static int springeInMehrerenSpruengen(int distanz, int sprung1, int sprung2) {
        if (distanz == 0) {
            return 1;
        }
        if (distanz < 0) {
            return 0;
        }


        return springeInMehrerenSpruengen(distanz - sprung1, sprung1, sprung2)
                + springeInMehrerenSpruengen(distanz - sprung2, sprung1, sprung2);
    }

    public static void main(String[] args) {
        int distanz1 = 4;
        int sprung1a = 1;
        int sprung2a = 2;
        System.out.println("Möglichkeiten für " + distanz1 + " Meter mit Sprüngen " +
                sprung1a + " und " + sprung2a + ": " +
                springeInMehrerenSpruengen(distanz1, sprung1a, sprung2a));


        int distanz2 = 5;
        int sprung1b = 2;
        int sprung2b = 3;
        System.out.println("Möglichkeiten für " + distanz2 + " Meter mit Sprüngen " +
                sprung1b + " und " + sprung2b + ": " +
                springeInMehrerenSpruengen(distanz2, sprung1b, sprung2b));
    }
}
