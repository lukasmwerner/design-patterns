from objects import *

weather_station = WeatherStation(75.0)
phone = Phone()
weather_app = WeatherApp()
weather_station.subscribe(phone)
weather_station.subscribe(weather_app)
weather_station.update_temperature_f(80.0)
print(f"The phone's external temerature state is: {phone.get_external_temperature()} ºF")