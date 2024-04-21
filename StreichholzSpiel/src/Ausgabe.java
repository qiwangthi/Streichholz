public class Ausgabe {
    // public static void main(String[] args) {

    // fordert den Anwender auf der Konsole auf, eine Zahl einzugeben
    public static void zahlEingeben() {
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 3 ein: ");

    }

    // gibt aus, dass die Eingabe keine Zahl war
    public static void keineZahl() {
        System.out.println("Das war keine Zahl!");
    }

    // informiert den Anwender, dass die Zahl nicht im gültigen Bereich (zwischen 1
    // und 3) liegt.
    public static void zahlNichtImBereich() {
        System.out.println("Die Zahl liegt nicht im gueltigen Bereich!");
    }

    // Die Methode menschGewinnt gratuliert dem Spieler zu seinem Sieg.
    public static void menschGewinnt() {
        System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
    }

    // gibt aus, dass leider der Computer gewonnen hat
    public static void computerGewinnt() {
        System.out.println("Der Computer hat gewonnen!");
    }

    // gibt an, dass weniger Hölzer auf dem Tisch liegen als der Mensch ziehen
    // wollte.
    public static void zugNichtMoeglich() {
        System.out.println("Das ist nicht moeglich! Es liegen nicht genug Hoelzer auf dem Tisch!");
    }

    // informiert den Anwender darüber, wie viele Hölzer aktuell auf dem Tisch
    // liegen
    public static void spielStand(int anzahl) {
        System.out.println("Es liegen " + anzahl + " Hoelzer auf dem Tisch.");
    }

    // berichtet über den Zug des menschlichen Spieler: Die Zahl der gezogenen
    // Hölzer und die verbleibende Anzahl auf dem Tisch
    public static void menschZug(int menschZug, int anzahl) {
        // anzahl -= menschZug;
        System.out.println("Sie nehmen " + menschZug + " Hoelzer und es bleiben noch" + anzahl + " Hoelzer uebrig.");

    }

    // Zug des Computers
    public static void computerZug(int computerZug, int anzahl) {
        // anzahl -= computerZug;
        System.out.println(
                "Der Computer nimmt " + computerZug + " Hoelzer und es bleiben noch" + anzahl + " Hoelzer uebrig.");
    }

}
