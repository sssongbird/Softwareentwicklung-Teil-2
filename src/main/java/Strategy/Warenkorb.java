package Strategy;

// Kontext-Klasse
public class Warenkorb {
    private RabattStrategie rabattStrategie;

    // Methode, um die Rabattstrategie zu setzen
    public void setRabattStrategie(RabattStrategie rabattStrategie) {
        this.rabattStrategie = rabattStrategie;
    }

    // Methode zur Berechnung des Endpreises mit der aktuellen Rabattstrategie
    public double berechneEndpreis(double preis) {
        return rabattStrategie.berechneRabatt(preis);
    }
}

/**
 * Die Warenkorb-Klasse ist die Kontext-Klasse
 * Referenz auf RabattStrategie wird gespeichert
 * setRabattStrategie kann die Strategie zur Laufzeit gewechselt werden
 * Methode berechneEndpreis verwendet die aktuelle Strategie ->> Endpreis (wer hätte es gedacht)
 */
