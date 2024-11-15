package org.example;

public class Zentralbank {
    //Der Konstruktor wird als privat deklariert -> so kann nicht mehr von außerhalb auf die Klasse zugegriffen werden
    private Zentralbank() {
    }
    //Es wird ein privates und statisches Objekt der Klasse erzeugt -> keine anderen Klassen haben Zugriff auf dieses Objekt
    private static Zentralbank zentralbank = new Zentralbank();

    //statische Methode über die man das Objekt zentralbank ausgibt
    //dieses Objekt kann nur über diese Methode ausgegeben werden
    public static Zentralbank getInstance() {
        return zentralbank;
    }

    private double leitzins = 0.5;

    public double getLeitzins() {
        return leitzins;
    }

    public void setLeitzins(double leitzins) {
        if (leitzins > 0.5)
            this.leitzins = leitzins;
    }
}
