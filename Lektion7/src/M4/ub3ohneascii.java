package M4;
import java.util.Scanner;
public class ub3ohneascii {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input whatever word: ");

            String inputString = input.nextLine();
            input.close();

            String result = uppercase(inputString);
            System.out.println(result);
        }

        private static String uppercase(String input) {
            char[] arr = new char[input.length()];

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);


                if (currentChar >= 'a' && currentChar <= 'z') {

                    currentChar = (char) (currentChar - ('a' - 'A'));
                }

                arr[i] = currentChar;
            }


            String result = "";
            for (char c : arr) {
                result += c;
            }

            return result;
        }
    }

