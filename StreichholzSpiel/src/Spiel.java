public class Spiel {
    // Attribute
    private int anzahl;

    // konstruktor
    public Spiel(int anzahl) {
        this.anzahl = anzahl;
    }

    // oeffentliche Methoden
    // im konstruktor soll nahc dem Aufruf der Mehode computerZiehen der Gewinn des
    // menschlichen spielers bekannt gegeben werden, sofern der Computer das letzte
    // Hloz nehmen musste
    public void computerZiehen() {
        int computerZug = 0;
        berechneComputerZug(computerZug); // Call the method to calculate the computer's move

        if (anzahl - computerZug <= 0) {
            System.out.println("Der Computer hat das letzte Streichholz genommen. Sie haben gewonnen!");
        } else if (computerZug > anzahl) {
            Ausgabe.zugNichtMoeglich();

        } else {

            System.out.println("Der Computer nimmt " + computerZug + " Streichhoelzer.");
            anzahl -= computerZug;
            Ausgabe.menschZug(computerZug, anzahl);
        }
    }

    public void menschenZiehen() {
        int menschlicherZug = 0;
        menschlicherZug = Eingabe.leseHoelzer(menschlicherZug);

        if (anzahl - menschlicherZug <= 0) {
            System.out.println("Sie haben das letzte Streichholz genommen. Der Computer hat gewonnen!");
        } else {

            System.out.println("Sie haben " + menschlicherZug + " Streichhoelzer genommen.");
            System.out.println("Es sind noch " + anzahl + " Streichhoelzer uebrig.");
        }
    }

    private int berechneComputerZug(int computerZug) {
        return computerZug = (int) Math.random() * 3 + 1;

    }

    // ziehen der Spieler und computer abwechselnd bis 1 Streichholz uebrig ist
    public void spielen() {
        while (anzahl > 1) {
            computerZiehen();
            if (anzahl <= 1) {
                break;
            }
            menschenZiehen();
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
