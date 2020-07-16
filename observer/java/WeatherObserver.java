package observer.java;

public interface WeatherObserver extends IObserver {

    public void update(WeatherStation station);
    default public void update() {
        
    }
}