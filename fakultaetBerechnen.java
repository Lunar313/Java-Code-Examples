public class fakultaetBerechnen {
    public static int fakultaet(int number){
        // 0. Abfangen ungültiger Eingaben
        if (number < 0){
            return -1;
        }
        // 1. Rekursionsanker
        if (number == 0){
            return 1;
        }
        else if (number == 1){
            return 1;
        }
        else {
            //2. Rekursionsschritt
            return number * fakultaet (number -1);
        }

    }
    public static void main(String [] args){
        System.out.println(fakultaet(-1)); // ungültige Eingabe
        System.out.println(fakultaet(0)); // 1
        System.out.println(fakultaet(1)); // 1
        System.out.println(fakultaet(5)); // 120
        System.err.println("20! = " + fakultaet(20)); // 2432902008176640000
    }
}
