package Lektion2;

public class aufgabe2 {
    public static void main (String [] args){
        float Kapital = 1000f;
        float zinssatz = 3.4f;
        float KapitalNachEinemJahr;
        KapitalNachEinemJahr = Kapital * (1.0f+(zinssatz/100.0f));
System.out.println("Verzinstes Kapital:" + KapitalNachEinemJahr);
    }
}
