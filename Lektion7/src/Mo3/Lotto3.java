package Mo3;

public class Lotto3 {
        public static void main(String[] args) {
            int[] lottozahlen = new int[6];
            for(int i = 0; i < 6; i++){
                lottozahlen[i] = (int)(Math.random()*49 +1);
            }
            int counter = 0;

            for(int i = 0; i<lottozahlen.length; i++) {
                int kleinsteZahl = lottozahlen[i];
                int aktuelleZahl = lottozahlen[i];
                int index = i;

                for(int j = counter; j<lottozahlen.length; j++) {
                    if(lottozahlen[j] < kleinsteZahl) {
                        kleinsteZahl = lottozahlen[j];
                        index = j;
                    }
                }
                lottozahlen[i] = kleinsteZahl;
                lottozahlen[index] = aktuelleZahl;
                counter++;
            }

            for(int i = 0; i < lottozahlen.length; i++) {
                System.out.print(lottozahlen[i] + " ");
            }
        }
    }
