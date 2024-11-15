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

        Researcher Justin = new Researcher(blackHole, "Justin");
        Researcher Robert = new Researcher(blackHole, "Robert");

        blackHole.setAction("swimming");
        System.out.println();
        blackHole.setAction("backflip");
        System.out.println();

    }
}
