
class IObserver:
    def update(self):
        pass

class IObservable:
    subscribers = []

    def subscribe(self, observer: IObserver):
        self.subscribers.append(observer)
    def unsubscribe(self, observer: IObserver):
        self.subscribers.remove(observer)
    def notify_subscribers(self):
        for subscriber in self.subscribers:
            subscriber.update()


class WeatherStation(IObservable):
    def __init__(self, temperature_f: float):
        self.__temperature_f = temperature_f

    def get_temperature_f(self) -> float:
        return self.__temperature_f

    def notify_subscribers(self):
        for subscriber in self.subscribers:
            subscriber.update(self)

    def update_temperature_f(self, temperature_f: float):
        self.__temperature_f = temperature_f
        self.notify_subscribers()
    


class WeatherObserver(IObserver):
    def update(self, station: WeatherStation):
        pass

class Phone(WeatherObserver):
    external_temperature_f = 0

    def update(self, station: WeatherStation):
        self.external_temperature_f = station.get_temperature_f()
        print(f"System: External temperature is {station.get_temperature_f()} ºF")
    def get_external_temperature(self):
        return self.external_temperature_f

class WeatherApp(WeatherObserver):
    def update(self, station: WeatherStation):
        self.external_temperature_f = station.get_temperature_f()
        print(f"WeatherApp: The temperature is {station.get_temperature_f()} ºF")