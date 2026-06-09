public class Konto {
    // inztnanzvariablen
    private String inhaber;
    private double saldo;

    // Klassenvariable, um die Anzahl der Konten zu verfolgen
    private static int anzahlKonten = 0;

    public Konto(String inhaber, double saldo) {
        this.inhaber = inhaber;
        this.saldo = saldo;
        anzahlKonten++;
    }

    public void abheben(double betrag) {
        double neuerSaldo = saldo - betrag;
        if (neuerSaldo < 0) {
            System.out.println("Kein Geld mehr auf dem Konto");
            return;
        }
        saldo = neuerSaldo;
    }

    public void info() {
        System.out.println(inhaber + " hat " + saldo + saldo + " €");
    }

    public static void main(String[] args) {
        Konto k1 = new Konto("Murtaza Khan", 1000);
        Konto k2 = new Konto("Amelie", 20000);

        k1.abheben(300);
        k2.abheben(700);

        k1.info();
        k2.info();
        System.out.println("insgesamt " + anzahlKonten + " Konten");
    }
}