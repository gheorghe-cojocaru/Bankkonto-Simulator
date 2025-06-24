public class Bankkonto {
    private String inhaber;
    private double kontostand;

    public Bankkonto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0.0;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
            System.out.println(betrag + " € wurden eingezahlt.");
        } else {
            System.out.println("Ungültiger Betrag.");
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0 && kontostand >= betrag) {
            kontostand -= betrag;
            System.out.println(betrag + " € wurden abgehoben.");
        } else {
            System.out.println("Abhebung nicht möglich.");
        }
    }

    public void zeigeKontostand() {
        System.out.println("Aktueller Kontostand: " + kontostand + " €");
    }
}
//..