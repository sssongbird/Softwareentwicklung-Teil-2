package Strategy;

// Konkrete Strategieklasse für den Weihnachtsrabatt
public class Weihnachtsrabatt implements RabattStrategie {

    @Override
    public double berechneRabatt(double preis) {
        return preis * 0.8;
    }
}

/**
 * Strategieklasse implementiert das RabattStrategie-Interface
 * definiert die Rabattlogik für einen bestimmten Rabatt
 */
