import java.util.Scanner;

public class Eingabe {
    static int menschZug = 0; // Variable für die eingegebene Zahl

    public static int leseZahl() {

        // LIEST EINE ZAHL VON DER KONSOLE EIN UND GIBT DIESE ALS INT-WERT ZURÜCK
        Ausgabe.zahlEingeben(); // Ausgabe, dass eine Zahl eingegeben werden soll
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) { // Repeat until a valid number is entered
                if (scanner.hasNextInt()) { // Check if the input is an integer
                    menschZug = scanner.nextInt(); // Assign the input to the variable

                    break; // Exit the loop
                } else {
                    Ausgabe.keineZahl(); // Ausgabe, dass keine Zahl eingegeben wurde
                    scanner.nextLine(); // Clear the invalid input
                }

            }
        }

        return menschZug; // Return the input as an integer
    }

    public static int leseHoelzer() {
        leseZahl();
        if (menschZug != 1 && menschZug != 2 && menschZug != 3) {
            Ausgabe.zahlNichtImBereich();
            return leseZahl();
        } else {
            return menschZug;
        }
    }

}
