package Übungen;

public class Würfelwurf4 {
        public static void main(String[] args) {


            int diceRoll = (int)(Math.random() * 6);

            String[] outcomes = {"Eins gewürfelt", "Zwei gewürfelt", "Drei gewürfelt", "Vier gewürfelt", "Fünf gewürfelt", "Sechs gewürfelt"};

            System.out.println(outcomes[diceRoll]);

        }

}
