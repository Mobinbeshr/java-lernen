package übungen;

import java.time.LocalTime;

public class übung3 {

    public static void main(String[] args) {

        float stunden = 12, minuten = 30, sekunden = 0;
        float sekundenSeitMitternacht = stunden * 3600 + minuten * 60 + sekunden;
        System.out.println("Sekunden seit Mitternacht: " + sekundenSeitMitternacht);
        System.out.println("Verbleibende Sekunden: " + (86400 - sekundenSeitMitternacht));
        System.out.printf("Prozent des Tages vergangen: ", (sekundenSeitMitternacht / 86400.0) * 100);
        LocalTime localTime= LocalTime.now();
        System.out.println("Aktuelle Systemzeit: " + localTime);
    }
}
