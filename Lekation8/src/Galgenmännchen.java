import java.util.Scanner;

public class Galgenmännchen {

    public static void main(String[] args) {

        String[] words = {
                "PROGRAMMIERSPRACHE", "JAVA", "INFORMATIK", "SOFTWARE",
                "HARDWARE", "ALGORITHMUS", "DATENBANK", "KOMPILIEREN",
                "DEBUGGEN", "BINARY", "NETZWERK", "CLOUD",
                "DATENSTRUKTUR", "KLASSE", "OBJEKT", "METHODEN",
                "VERERBUNG", "INTERFACE", "KONSTRUKTOR", "SCHLEIFE"
        };


        String word = words[(int) (Math.random() * words.length)].toUpperCase();
        char[] wordChars = word.toCharArray();
        char[] displayChars = new char[word.length()];


        for (int i = 0; i < displayChars.length; i++) {
            displayChars[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        final int maxAttempts = 15;
        boolean wordGuessed = false;


        while (attempts < maxAttempts && !wordGuessed) {
            System.out.println((attempts + 1) + ". Versuch: " + new String(displayChars));
            System.out.print("Geben Sie einen Buchstaben ein: ");
            String input = scanner.nextLine().toUpperCase();


            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie einen Buchstaben ein.");
                continue;
            }

            char guessedChar = input.charAt(0);
            boolean charFound = false;

            // Prüfen, ob der Buchstabe im Wort enthalten ist
            for (int i = 0; i < wordChars.length; i++) {
                if (wordChars[i] == guessedChar && displayChars[i] != guessedChar) {
                    displayChars[i] = guessedChar;
                    charFound = true;
                }
            }

            if (!charFound) {
                System.out.println("Der Buchstabe ist nicht im Wort enthalten.");
            }

            attempts++;


            wordGuessed = new String(displayChars).equals(word);
        }


        if (wordGuessed) {
            System.out.println("Herzlichen Glückwunsch! Sie haben das Wort erraten: " + word);
        } else {
            System.out.println("Sie haben die maximale Anzahl an Versuchen erreicht. Das Wort war: " + word);
        }

        scanner.close();
    }
}
