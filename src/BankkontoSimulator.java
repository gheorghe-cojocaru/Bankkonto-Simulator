import java.util.Scanner;

public class BankkontoSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bankkonto konto = new Bankkonto("GC");

        boolean weiter = true;

        while (weiter) {
            System.out.println("\nWas möchten Sie tun?");
            System.out.println("1) Kontostand anzeigen");
            System.out.println("2) Einzahlen");
            System.out.println("3) Abheben");
            System.out.println("0) Beenden");
            System.out.print("> ");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    konto.zeigeKontostand();
                    break;
                case 2:
                    System.out.print("Betrag zum Einzahlen: ");
                    double einzahlung = scanner.nextDouble();
                    konto.einzahlen(einzahlung);
                    break;
                case 3:
                    System.out.print("Betrag zum Abheben: ");
                    double abhebung = scanner.nextDouble();
                    konto.abheben(abhebung);
                    break;
                case 0:
                    weiter = false;
                    System.out.println("Tschüss!");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }

        scanner.close();
    }
}
