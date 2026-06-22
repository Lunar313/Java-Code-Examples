/**
 * Übnungsaufgabe OOP Rechteck
 * Todos folgen und die klasse Rechteck selbt schreiben 
 */
//--Todo 1: Felder check-- 
public class Rechteck{
    private double breite;
    private double hoehe;
    private int id;
    public static int anzahlRechtecke = 0;
    public  static int naechsteID = 1; //wichtig ansonsten beginnt erste id bei 0 
    
    // --Todo: Standard Konstruktor schreiben
    // Merke Konstruktoren haben kein Return und keinen Rückgabetyp
    //Ein Konstruktor heißt genau wie die Klasse ohne Rückgabetyp (void, int , double usw.)

    public Rechteck (){
        this(1.0, 1.0);
    }
    //--Todo 3: konstuktor mit Hoehe und Breite 

    public Rechteck (double breite, double hoehe){
        this.breite = breite;
        this.hoehe = hoehe;
        this.id = naechsteID;
        naechsteID++;
        anzahlRechtecke++;
    }

// --todo4: Konstuktor für ein Quadrat -> ein Quadrat ist ein Rechteck mit Bereite und Hoehe
public Rechteck(double seite){
    this(seite, seite);
}
// -- Todo5: Getter 
public double getBreite() { return breite; }
public double getHoehe(){ return hoehe; }
public int getId() { return id; }

//-- todo6: flaeche () -> berechnen der Rechteck flaeche breite * hoehe 
public double flaeche () {
    return breite * hoehe;
}

// --Todos7--Umfang eines Rechtecks
public double umfang(){
    return 2 * (breite + hoehe);

}

//--Todo8-- istQuadrat()
 public boolean istQuadrat(){
    return breite == hoehe;
 }

 // --Todo 9-- vergroßern 
public void vergroessern(double faktor){
    breite = breite * faktor;
    hoehe = hoehe * faktor;
}
//--todo 10-- toString()
@Override
public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("Rechteck #" + id);
    builder.append(" (" + breite);
    builder.append(" x " + hoehe + ")");
    return builder.toString();
} 

// -- todo 11-- getAnzahl
public static int getAnzahl(){
    return anzahlRechtecke;
}




// --main-- 
 public static void main(String args[]){


    Rechteck r1 = new Rechteck();
    Rechteck r2 = new Rechteck(5, 4);
    Rechteck r3 = new Rechteck (4);
    Rechteck r4 = new Rechteck (3, 3);


    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);

    System.out.println( "Flaeche r2: " +r2.flaeche());
    System.out.println("Umfang r2: " + r2.umfang());
    System.out.println("Isr r3 Quadrat? " + r3.istQuadrat());
    System.out.println("Ist r2 Quadrat? " + r2.istQuadrat());

    r2.vergroessern(2);
    System.out.println("Nach Vergrößern: " + r2);

    System.out.println( " Insgesamt erzeugt: " + Rechteck.getAnzahl());
 }
}