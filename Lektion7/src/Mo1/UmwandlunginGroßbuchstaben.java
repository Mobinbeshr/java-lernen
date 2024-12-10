package Mo1;

public class UmwandlunginGroßbuchstaben {

        public static void main(String[] args) {
            char[] array = {'a', 'B', 'c', 'D', 'e'};
            char[] result = inGrossbuchstaben(array);
            System.out.println(java.util.Arrays.toString(result));
        }

        public static char[] inGrossbuchstaben(char[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 'a' && array[i] <= 'z') {
                    array[i] -= 32;
                }
            }
            return array;
        }


}
