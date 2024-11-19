package Subjekt;
import Beobachter.*;

public interface object {
    public abstract void registerObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    void alertObserver();
}
