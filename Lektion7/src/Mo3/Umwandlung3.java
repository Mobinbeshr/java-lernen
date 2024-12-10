package Mo3;

public class Umwandlung3 {
        public static char[] inGrossbuchstaben(char[] x) {
            for(int i = 0; i < x.length; i++){
                if(x[i] >= 'a' && x[i] <= 'z') {
                    x[i] -= 32;
                }
            }
            return x;
        }

        public static void main(String[] args) {
            char[] array = {'1', 'B', 'c', 'D', 'e', 'f', 'g', '5'};
            System.out.println(inGrossbuchstaben(array));
        }
    }

