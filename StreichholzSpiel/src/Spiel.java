public class Spiel {
    // Attribute
    private int anzahl;

    // konstruktor
    public Spiel(int anzahl) {
        this.anzahl = anzahl;
    }

    // oeffentliche Methoden
    public void computerZiehen() {
        anzahl -= 1;
    }

    public void spielerZiehen() {
        anzahl -= 1;
    }

    private void berechneComputerZug() {

    }

    // ziehen der Spieler und computer abwechselnd bis 1 Streichholz uebrig ist
    public void spielen() {
        while (anzahl > 1) {
            spielerZiehen();
            computerZiehen();
        }
    }

    // getter
    public int getAnzahl() {
        return this.anzahl;
    }

    // setter
    public void setStreichhoelzer(int anzahl) {
        this.anzahl = anzahl;
    }

}
