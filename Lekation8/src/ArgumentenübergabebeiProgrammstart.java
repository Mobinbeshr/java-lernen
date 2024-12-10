public class ArgumentenübergabebeiProgrammstart {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Fehler: Bitte geben Sie genau zwei Zahlen als Argumente ein.");
            System.out.println("Beispiel: java KommandozeilenMultiplikation 3 4");
            return;
        }

        try {

            double zahl1 = Double.parseDouble(args[0]);
            double zahl2 = Double.parseDouble(args[1]);


            double ergebnis = zahl1 * zahl2;


            System.out.println("Das Ergebnis der Multiplikation von " + zahl1 + " und " + zahl2 + " ist: " + ergebnis);

        } catch (NumberFormatException e) {

            System.out.println("Fehler: Beide Argumente müssen gültige Zahlen sein.");
            System.out.println("Beispiel: java KommandozeilenMultiplikation 3 4");
        }
    }
}
