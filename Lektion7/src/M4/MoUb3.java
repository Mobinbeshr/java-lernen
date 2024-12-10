package M4;
import java.util.Scanner;
public class MoUb3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input whatever word: ");

            String inputString = input.nextLine();
            input.close();

            // Convert the string to uppercase without using prohibited methods
            String result = uppercase(inputString);
            System.out.println(result);
        }

        private static String uppercase(String input) {
            char[] arr = new char[input.length()];

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                int ascii = (int) currentChar;

                // Check if the character is a lowercase letter
                if (ascii >= 97 && ascii <= 122) {
                    ascii -= 32; // Convert to uppercase by subtracting 32
                }

                arr[i] = (char) ascii; // Store the modified character
            }

            // Convert the character array back to a string
            String result = "";
            for (char c : arr) {
                result += c; // Append each character to the result
            }

            return result;
        }
    }

