public class Spiel {
    // Attribute
    static int anzahl;

    // konstruktor
    public Spiel(int anzahl) {
        Spiel.anzahl = anzahl;
    }

    // oeffentliche Methoden
    // im konstruktor soll nahc dem Aufruf der Mehode computerZiehen der Gewinn des
    // menschlichen spielers bekannt gegeben werden, sofern der Computer das letzte
    // Hloz nehmen musste
    public static void computerZiehen() {
        // Call the method to calculate the computer's move

        int computerZug = 0;
        computerZug = berechneComputerZug(computerZug);
        int gezogeneHoelzer = computerZug;
        anzahl -= gezogeneHoelzer;
        Ausgabe.computerZug(computerZug, anzahl);
        if (anzahl <= 0) {
            Ausgabe.menschGewinnt();
        }
    }

    public static void menschenZiehen() {
        int menschZug = Eingabe.leseHoelzer();
        int gezogeneHoelzer = menschZug;
        if (gezogeneHoelzer > anzahl) {
            Ausgabe.zugNichtMoeglich();
            menschenZiehen();
        } else {
            anzahl -= gezogeneHoelzer;
            Ausgabe.menschZug(menschZug, anzahl);
            if (anzahl <= 0) {
                Ausgabe.computerGewinnt();
            } else {
                computerZiehen();
            }

        }
    }

    // ziehen der Spieler und computer abwechselnd bis 1 Streichholz uebrig ist

    public static void spielen() {

        while (anzahl > 1) {
            menschenZiehen();
            if (anzahl == 1) {
                Ausgabe.menschGewinnt();
                break;
            }
            computerZiehen();
            if (anzahl == 1) {
                Ausgabe.computerGewinnt();
                break;

            }
        }
    }

    // berechnet den Zug des Computers
    public static int berechneComputerZug(int computerZug) {
        computerZug = (int) (Math.random() * 3) + 1;
        return computerZug;
    }

    // getter
    public int getAnzahl() {
        return Spiel.anzahl;
    }

    // setter
    public void setStreichhoelzer(int anzahl) {
        Spiel.anzahl = anzahl;
    }

}
