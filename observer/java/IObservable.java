package observer.java;

import java.util.ArrayList;

public interface IObservable {
    public void subscribe(IObserver observer);
    public void unsubscribe(IObserver observer);
    public void notifySubscribers();
}