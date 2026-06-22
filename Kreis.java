public class Kreis {
    private double radius;
    // Removed durchMesser field as it is calculated dynamically
    // Removed flaeche field as it is calculated dynamically
    private final int id;
    private static int anzahlKreise = 0;
    private static int naechstID = 1;

    public Kreis(double radius) {
        this.radius = radius;
        this.id = naechstID++;
        anzahlKreise++;
    }
         }

    public double umfang() {
        return Math.PI * (2 * radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getFlaeche() {
        return Math.PI * radius * radius;
    }
    public static int getAnzahl() {
        return Kreis.anzahlKreise;
    }
    public void vergroessern(double faktor){
        radius = radius * faktor;
    }
    @Override
    // Removed duplicate toString method
    public double berechneFlaeche(double radius){
        return Math.PI * (radius * radius);
        }
    @Override
    public String toString() {
        return "Kreis [id=" + id + ", radius=" + radius + ", flaeche=" + getFlaeche() + "]";
    }
}