import java.util.Scanner;

public class Eingabe {
    public static int leseZahl(int menschlicherZug) {
        // LIEST EINE ZAHL VON DER KONSOLE EIN UND BIT DISE ALS INT-WERT ZURÜCK
        Scanner scanner = new Scanner(System.in); // Scanner-Objekt erzeugen
        Ausgabe.zahlEingeben(); // Ausgabe, dass eine Zahl eingegeben werden soll
        while(true){
            try {
           menschlicherZug = Integer.parseInt(scanner.nextLine()); // Assign the parsed integer value directly to the existing
                                                         // "zahl" variable
        } catch (NumberFormatException e) {
            Ausgabe.keineZahl(); // Ausgabe, dass keine Zahl eingegeben wurde
            return leseZahl(int menschlicherZug); // Rekursiver Aufruf der Methode, um eine Zahl zu erhalten
        }
        scanner.close(); // Close the Scanner object to prevent resource leak
        return menschlicherZug; // Eingegebene Zahl zurückgeben
    }
}

    public static int leseHoelzer(int zahl) {

        leseZahl(zahl);
        if (zahl != 1 && zahl != 2 && zahl != 3) {
            Ausgabe.zahlNichtImBereich();
            return leseZahl(zahl);
        } else {
            return zahl;
        }
    }
}
