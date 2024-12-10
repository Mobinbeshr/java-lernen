public class EinfacherRechner {

        public static void main(String[] args) {

            if (args.length < 2) {
                System.out.println("Fehler: Es müssen mindestens zwei Zahlen und ein Operator (+ oder -) übergeben werden.");
                System.out.println("Beispiel: java Parameteruebergabe 1 2 3 +");
                return;
            }


            String operator = args[args.length - 1];


            if (!operator.equals("+") && !operator.equals("-")) {
                System.out.println("Fehler: Der Operator muss entweder '+' oder '-' sein.");
                return;
            }

            try {

                double result = Double.parseDouble(args[0]);

                for (int i = 1; i < args.length - 1; i++) {
                    double number = Double.parseDouble(args[i]);
                    if (operator.equals("+")) {
                        result += number;
                    } else if (operator.equals("-")) {
                        result -= number;
                    }
                }


                System.out.println("Das Ergebnis ist: " + result);

            } catch (NumberFormatException e) {

                System.out.println("Fehler: Alle Argumente außer dem letzten müssen gültige Zahlen sein.");
            }
        }
    }

