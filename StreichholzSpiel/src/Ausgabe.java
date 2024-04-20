public class Ausgabe {
    public static void main(String[] args) {

    // fordert den Anwender auf der Konsole auf, eine Zahl einzugeben
    public void zahlEingeben() {
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 3 ein: ");
    }

    // Eingabe ist keine Zahl,methode mit bedingung
    public void keineZahl() {
        System.out.println("Das ist keine Zahl!");

    }

    // informiert den Anwender, dass die Zahl nicht im gültigen Bereich (zwischen 1
    // und 3) liegt.
    public void zahlNichtImBereich() {
        System.out.println("Die Zahl liegt nicht im gueltigen Bereich!");
    }

    // Die Methode menschGewinnt gratuliert dem Spieler zu seinem Sieg.
    public void menschGewinnt() {
        System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
    }

    // gibt aus, dass leider der Computer gewonnen hat
    public void computerGewinnt() {
        System.out.println("Der Computer hat gewonnen!");
    }

    // gibt an, dass weniger Hölzer auf dem Tisch liegen als der Mensch ziehen
    // wollte.
    public void zuNichtMoeglich() {
        System.out.println("Das ist nicht moeglich! Es liegen nicht genug Hoelzer auf dem Tisch!");
    }

    // informiert den Anwender darüber, wie viele Hölzer aktuell auf dem Tisch
    // liegen
    public void spielStand(int anzahl) {
        System.out.println("Es liegen " + anzahl + " Hoelzer auf dem Tisch.");
    }

    // berichtet über den Zug des menschlichen Spieler: Die Zahl der gezogenen
    // Hölzer und die verbleibende Anzahl auf dem Tisch
    public void menschZug(int zahl, int verbleibend) {
        System.out.println("Sie nehmen " + zahl + " Hoelzer und es bleiben noch" + verbleibend + " Hoelzer uebrig.");

    }

    // Zug des Computers
    public void computerZug(int zahl, int verbleibend) {
        System.out.println(
                "Der Computer nimmt " + zahl + " Hoelzer und es bleiben noch" + verbleibend + " Hoelzer uebrig.");
    }
}

}}
