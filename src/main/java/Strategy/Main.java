package Strategy;

public class Main {
    public static void main(String[] args) {
        Warenkorb warenkorb = new Warenkorb();

        double preis = 100.0;

        // Weihnachtsrabatt anwenden
        warenkorb.setRabattStrategie(new Weihnachtsrabatt());
        System.out.println("Weihnachtsrabatt Preis: " + warenkorb.berechneEndpreis(preis));

        // Neujahrsrabatt anwenden
        warenkorb.setRabattStrategie(new Neujahrsrabatt());
        System.out.println("Neujahrsrabatt Preis: " + warenkorb.berechneEndpreis(preis));

        // Kein Rabatt anwenden
        warenkorb.setRabattStrategie(new KeinRabatt());
        System.out.println("Preis ohne Rabatt: " + warenkorb.berechneEndpreis(preis));
    }
}

/**
 * erstellt Warenkorb-Objekt
 * setRabattStrategie setzt dynamisch gewünschte Rabattstrategie
 * berechneEndpreis ruft die entsprechende berechneRabatt-Methode der aktuell gesetzten Strategie auf
 * gibt Preis zurück
 */

