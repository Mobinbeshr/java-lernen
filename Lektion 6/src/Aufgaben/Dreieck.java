package Aufgaben;

public class Dreieck {

    public static void einfachesDreieckDreieck(int zeilen) {
        for (int i = 1; i <= zeilen; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void zentriertesDreieck(int zeilen) {
        for (int i = 1; i <= zeilen; i++) {

            for (int j = 1; j <= zeilen - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int zeilen = 5;

        System.out.println("Einfaches Dreieck:");
        einfachesDreieckDreieck(zeilen);

        System.out.println("\nZentriertes Dreieck:");
        zentriertesDreieck(zeilen);
    }
}

