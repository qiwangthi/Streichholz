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
        return menschZug;
    }

    public static int leseHoelzer() {
        int menschZug = leseZahl();
        if (menschZug < 1 || menschZug > 3) {
            Ausgabe.zahlNichtImBereich();
            // menschZug = leseZahl();
        }
        return menschZug;
    }
}
