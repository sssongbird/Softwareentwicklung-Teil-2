package Subjekt;
import Beobachter.Observer;
import java.util.ArrayList;
import java.util.List;
import Beobachter.Observer;

public class BlackHole implements object {

    private List<Observer> observerList = new ArrayList<Observer>();

    private String action;

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void alertObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }

    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
        this.alertObserver();
    }
}
