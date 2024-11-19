package Strategy;

// Konkrete Strategieklasse für Neujahrsrabatt
public class Neujahrsrabatt implements RabattStrategie {

    @Override
    public double berechneRabatt(double preis) {
        return preis * 0.9;
    }
}
/**
 * Strategieklasse implementiert das RabattStrategie-Interface
 * definiert die Rabattlogik für einen bestimmten Rabatt
 */