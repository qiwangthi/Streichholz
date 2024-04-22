public class Spiel {
    // Attribute
    private int anzahl;

    // konstruktor
    public Spiel(int anzahl) {
        this.anzahl = anzahl;
    }

    // getter
    public int getAnzahl() {
        return this.anzahl;
    }

    // setter
    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    // die methode spielen soll das Spiel starten und abwechselnd die Methoden
    // comuterZiehn und menschenZiehen aufrufen, solange sich noch steichhoelzer auf
    // dem Tisch befinden. Wenn das Spiel beendet ist, soll die Methode den Gewinner
    // ausgeben (Mensch oder Computer)
    public void spielen() {
        Ausgabe.spielStand(anzahl);
        while (this.anzahl > 0) {
            computerZiehen();
            if (this.anzahl <= 0) {
                Ausgabe.menschGewinnt();
                break;
            }
            menschenZiehen();
            if (this.anzahl <= 0) {
                Ausgabe.computerGewinnt();
                break;
            }
        }
    }

    // oeffentliche Methoden
    // im konstruktor soll nahc dem Aufruf der Mehode computerZiehen der Gewinn des
    // menschlichen spielers bekannt gegeben werden, sofern der Computer das letzte
    // Hloz nehmen musste
    public void computerZiehen() {
        // Call the method to calculate the computer's move

        int computerZug = 0;
        computerZug = berechneComputerZug(computerZug);
        int gezogeneHoelzer = computerZug;
        anzahl -= gezogeneHoelzer;
        Ausgabe.computerZug(computerZug, this.anzahl);

    }

    public void menschenZiehen() {
        int menschZug = Eingabe.leseHoelzer();

        if (menschZug > this.anzahl) {
            Ausgabe.zugNichtMoeglich();
            // menschenZiehen();
            Eingabe.leseHoelzer();
        } else {
            anzahl -= menschZug;
            Ausgabe.menschZug(menschZug, anzahl);

        }
    }

    // ziehen der Spieler und computer abwechselnd bis 1 Streichholz uebrig ist

    // berechnet den Zug des Computers um das Spiel zu gewinnen,duerfen 1,2 oder 3
    public int berechneComputerZug(int computerZug) {
        return computerZug = this.anzahl % 3 + 1;
    }
}
