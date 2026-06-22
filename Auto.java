/** 
 * Thema 1: Objektorientierte Programmierung 
 * Übung Tippe diese snipped vom hand ab
 * Ziel: Konstruktor,  Felder, Getter und Setter, toString(), equals(), sicher beherrschen
 * Häufige Klausurfragen:
 * 1. Was ist der Unterschied zwischen Instanz- und Klassenvariablen?
 * 2. Wann wird ein Konsstruktor aufgerufen?
 * 3. Was passiert ohne Konstruktor in einer Klasse?
 * was ist "this"?
 */
public class Auto{
    // Instanzvariablen (Jedes Objekt hat eigene)
    private String marke;
    private String modell;
    private int bauJahr;
    private double KmStand;

// klassenvariablen (gehört zur Klasse, nicht zum Objekt)
private static int anzahlAutos = 0;

// --- konstruktor--- Ein Default Konstruktor für ein erstelltes Objekt
    public Auto(String marke, String modell, int bauJahr){

        this.marke = marke;
        this.modell = modell;
        this.bauJahr = bauJahr;
        this.KmStand = 0.0;
            anzahlAutos++;
        }

    // -- Setter mit Validierungen --
    public void setKmStand (double km) {
        if (km < this.KmStand) {
            throw new IllegalArgumentException("Kilometerstand kann nicht zurückgehen!");
        }
        this.KmStand = km;
    }
    // --- Klassenmethode (Static)
    public static int getAnzahlAutos(){
        return anzahlAutos;
    }
    // --- toString methode überschreiben--
    @Override
    public String toString(){
        return marke + " " + modell + " (" + bauJahr + ", " + KmStand + "km)";
    }
    
    // -- equals überschreiben
    @Override
    public boolean equals (Object o){
        if (this == o)
            return true;
        if (!(o instanceof Auto)) return false;
        Auto a = (Auto) o;
        return bauJahr == a.bauJahr && marke.equals(a.marke) && modell.equals(a.modell);
    }
    @Override
    public int hashCode(){
        return marke.hashCode() + modell.hashCode() + bauJahr;
    }
    // --- Überlandener Konstruktor ---
    public Auto(String marke, String modell){
        this(marke, modell, 2026); // ruft einen anderen Konstruktor auf
    }

    // --- main zum Testen
    public static void main (String args[]){
        Auto a1 = new Auto("VW", "Golf", 2022);
        Auto a2 = new Auto ("BMW", "i4"); // nutzt überladenen Konstruktor 
        a1.setKmStand(50000);
    
        System.out.println(a1);
        System.out.println("Anzahl Autos: " + Auto.getAnzahlAutos()); //static
        System.out.println("Gleich? " + a1.equals(a2));
    
    }
    // -- Getter --
    public String getMarke() {return marke;}
    public String getModell() { return modell;}
    public int getBauJahr() { return bauJahr;}
    public double getKmStand() { return KmStand;} 
}