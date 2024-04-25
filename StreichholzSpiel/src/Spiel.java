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
            if (this.anzahl <= 1) {
                Ausgabe.computerGewinnt();
                break;
            }
            menschenZiehen();
            if (this.anzahl <= 1) {
                Ausgabe.menschGewinnt();
                break;
            }

        }
    }

    // oeffentliche Methoden
    // im konstruktor soll nahc dem Aufruf der Mehode computerZiehen der Gewinn des
    // menschlichen spielers bekannt gegeben werden, sofern der Computer das letzte
    // Hloz nehmen musste
    public void computerZiehen() {
        int computerZug = 0;
        computerZug = berechneComputerZug(computerZug);
        int gezogeneHoelzer = computerZug;
        anzahl -= gezogeneHoelzer;
        Ausgabe.computerZug(computerZug, this.anzahl);

    }

    public void menschenZiehen() {
        int menschZug;
        do {
            menschZug = Eingabe.leseHoelzer();
            if (menschZug > this.anzahl) {
                Ausgabe.zugNichtMoeglich();
            } else if (menschZug < 1 || menschZug > 3) {
                Ausgabe.zahlNichtImBereich();
            } else {
                anzahl -= menschZug;
                Ausgabe.menschZug(menschZug, this.anzahl);
            }
        } while (menschZug < 1 || menschZug > 3 || menschZug > this.anzahl);
    }
    //

    // berechnet den Zug des Computers um das Spiel zu gewinnen,duerfen 1,2 oder 3
    public int berechneComputerZug(int computerZug) {
        if (this.anzahl % 4 == 0) {
            computerZug = 3;
        }
        if (this.anzahl % 4 == 1) {
            computerZug = 1;
        }
        if (this.anzahl % 4 == 2) {
            computerZug = 1;
        }
        if (this.anzahl % 4 == 3) {
            computerZug = 2;
        }
        return computerZug;
    }
}