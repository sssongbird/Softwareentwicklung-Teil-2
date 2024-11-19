package Strategy;

// Konkrete Strategieklasse keinen Rabatt
public class KeinRabatt implements RabattStrategie {

    @Override
    public double berechneRabatt(double preis) {
        return preis;
    }
}

/**
 * Strategieklasse implementiert das RabattStrategie-Interface
 * definiert die Rabattlogik für einen bestimmten Rabatt
 */
