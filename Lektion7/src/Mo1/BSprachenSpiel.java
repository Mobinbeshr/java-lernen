package Mo1;

public class BSprachenSpiel {

        public static void main(String[] args) {
            String eingabe = "spiel mit mir";
            System.out.println(spielen(eingabe));
        }

        public static String spielen(String eingabe) {
            char[] array = eingabe.toCharArray();
            StringBuilder bSprache = new StringBuilder();

            for (char c : array) {
                if ("Siuuu".indexOf(c) >= 0) {
                    bSprache.append(c).append('b').append(c);
                } else {
                    bSprache.append(c);
                }
            }

            return bSprache.toString();
        }

}
