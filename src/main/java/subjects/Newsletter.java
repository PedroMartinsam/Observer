package subjects;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject{

    private List<Observer> observers;
    private List<String> emails;

    public Newsletter (){
        this.observers = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observers.isEmpty())
            observers.removeIf(x -> x.equals(observer));
    }

    @Override
    public void notiFyObserver() {
        for(Observer observer : observers){
            if (!emails.isEmpty())
                observer.update(emails.get(emails.size()-1));
        }
    }
    @Override
    public void addMessage(String message){
        this.emails.add(message);
        this.notiFyObserver();
    }
}

