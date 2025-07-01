package subjects;

import observers.Observer;

public interface Subject {

    public void registerObserver (Observer observer);
    public void removeObserver (Observer observer);
    public void notiFyObserver();
    public void addMessage(String message);
}
