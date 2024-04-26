import java.util.Scanner;

public class Eingabe {

    public static int leseZahl() {
        Ausgabe.zahlEingeben();
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        int menschZug = 0;
        try {
            menschZug = Integer.parseInt(eingabe);
        } catch (NumberFormatException e) {
            Ausgabe.keineZahl();
            // menschZug = leseZahl();
        }
        // scanner.close(); // Close the scanner
        return menschZug;
    }

    public static int leseHoelzer() {
        int menschZug = leseZahl();
        return menschZug;
    }
}
