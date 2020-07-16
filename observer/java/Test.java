package observer.java;

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(75.0);
        Phone phone = new Phone();
        WeatherApp wApp = new WeatherApp();
        weatherStation.subscribe(phone);
        weatherStation.subscribe(wApp);
        weatherStation.setTempFahrenheit(80.0);
        System.out.println("The phone's external temerature state is: " + phone.getExternalTemperature() + "ºF");
    }
}