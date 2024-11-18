package org.example;
import Tiere.*;
import Beobachter.*;
import Subjekt.*;


public class Main {
    public static void main(String[] args) {

        Zentralbank zentralbank = Zentralbank.getInstance();
        System.out.println("Der aktuelle Leitzins liegt bei: " + zentralbank.getLeitzins() + " Prozent");

        Tier clownfisch = TierFabrik.erstelleTier("Clownfisch");
        clownfisch.vorstellung();

        BlackHole blackHole = new BlackHole();

        Researcher Ricardo = new Researcher(blackHole, "Ricardo");
        Researcher Yaplias = new Researcher(blackHole, "Yaplias");

        blackHole.setAction("swimming");
        System.out.println();
        blackHole.setAction("doing backflips");
        System.out.println();

    }
}
