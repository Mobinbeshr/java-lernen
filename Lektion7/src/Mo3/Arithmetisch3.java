package Mo3;
import java.util.Scanner;
public class Arithmetisch3 {
        public static String messReihe(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("einzulesende Werte: ");
            int anzahlWerte = scanner.nextInt();
            double[] werte = new double[anzahlWerte];
            System.out.println("Geben sie ihre " + anzahlWerte + " Werte ein");

            for(int i = 0; i < anzahlWerte; i++){
                System.out.print(i+1 + ". Wert: ");
                werte[i] = scanner.nextDouble();

                if(werte[i] == 0) {
                    System.out.println("Zahl 0 unzulässig");
                    break;
                }
            }
            double kleinsterWert = werte[0];
            double groesterWert = werte[0];
            double mittelwert = 0;

            for(int i = 0; i < werte.length; i++){

                if(kleinsterWert > werte[i]){
                    kleinsterWert = werte[i];
                }else if(groesterWert < werte[i]){
                    groesterWert = werte[i];
                }
                mittelwert += werte[i];
            }
            mittelwert /= anzahlWerte;

            double standardAbweichung = 0;

            for(int i = 0; i < werte.length; i++){
                standardAbweichung += Math.pow((werte[i] - mittelwert), 2);
            }
            standardAbweichung = Math.sqrt(standardAbweichung/anzahlWerte);

            return " Kleinster Wert: " + kleinsterWert + "\n Groester Wert: " + groesterWert + "\n Mittelwert: " + mittelwert + "\n Standard Abweichung: " + standardAbweichung;
        }

        public static void main(String[] args) {
            System.out.println(messReihe());
        }
    }
