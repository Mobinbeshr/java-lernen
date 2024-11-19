package selbstaufgaben;


public class Würfelwurf{
    public static void main(String[] args) {
            int zahl = (int)(Math.random() * 6)+1;

            if (zahl == 1) System.out.println("Eins gewürfelt");
            else if (zahl == 2) System.out.println("Zwei gewürfelt");
            else if (zahl == 3) System.out.println("Drei gewürfelt");
            else if (zahl == 4) System.out.println("Vier gewürfelt");
            else if (zahl == 5) System.out.println("Fünf gewürfelt");
            else System.out.println("Sechs gewürfelt");
    }
}
