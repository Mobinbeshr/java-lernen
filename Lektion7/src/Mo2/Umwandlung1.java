package Mo2;

import java.util.Scanner;

public class Umwandlung1 {
    public static char[] inGrossbuchstaben(char[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 'a' && input[i] <= 'z') {
                input[i] = (char) (input[i] - ('a' - 'A'));
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Text ein:");
        String inputText = scanner.nextLine();


        char[] charArray = inputText.toCharArray();

        char[] result = inGrossbuchstaben(charArray);


        System.out.println("Der Text in Großbuchstaben lautet:");
        System.out.println(new String(result));

        scanner.close();
    }
}

