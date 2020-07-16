package observer.java;

public class Phone implements WeatherObserver {
    double externalTemperature = 0;

    @Override
    public void update(WeatherStation station) {
        System.out.println("System: " + "External temperature is " + station.getTempFahrenheit() + "ºF");
        externalTemperature = station.getTempFahrenheit();
    }

    public double getExternalTemperature() {
        return this.externalTemperature;
    }

    public void setExternalTemperature(double externalTemperature) {
        this.externalTemperature = externalTemperature;
    }
    
}
