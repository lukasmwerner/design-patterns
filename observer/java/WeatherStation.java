package observer.java;

import java.util.ArrayList;

public class WeatherStation implements IObservable {
    private ArrayList<WeatherObserver> subscribers;

    private double tempFahrenheit;

    public WeatherStation(double tempF) {
        subscribers = new ArrayList<>();
        tempFahrenheit = tempF;
    }

    public double getTempFahrenheit() {
        return this.tempFahrenheit;
    }

    public void setTempFahrenheit(double tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
        notifySubscribers();
    }

    @Override
    public void subscribe(IObserver observer) {
        subscribers.add((WeatherObserver) observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        subscribers.remove((WeatherObserver) observer);

    }

    @Override
    public void notifySubscribers() {
        for (WeatherObserver weatherObserver : subscribers) {
            weatherObserver.update(this);
        }
    }

    
}