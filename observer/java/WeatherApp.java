package observer.java;

public class WeatherApp implements WeatherObserver {

    @Override
    public void update(WeatherStation station) {
        System.out.println("WeatherApp: The temperature is " + station.getTempFahrenheit() + "ºF");
    }

}