package Beobachter;

import Subjekt.BlackHole;


public class Researcher implements Observer{
    private String name;
    private BlackHole blackHole;

    public Researcher(BlackHole blackHole, String name) {
        this.blackHole = blackHole;
        this.name = name;
        blackHole.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("The researcher " + name + " sees that the Black Hole " + name + "is doing" + blackHole.getAction());
    }

}
