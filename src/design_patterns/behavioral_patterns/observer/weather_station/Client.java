package design_patterns.behavioral_patterns.observer.weather_station;

import design_patterns.behavioral_patterns.observer.weather_station.observable.WeatherStationObservableImpl;
import design_patterns.behavioral_patterns.observer.weather_station.observable.WeatherObservable;
import design_patterns.behavioral_patterns.observer.weather_station.observer.MobileDisplayObserverImpl;
import design_patterns.behavioral_patterns.observer.weather_station.observer.TvDisplayObserverImpl;
import design_patterns.behavioral_patterns.observer.weather_station.observer.NotificationAlertObserver;

public class Client {
    public static void main(String[] args) {
        WeatherObservable weatherObservable = new WeatherStationObservableImpl();

        NotificationAlertObserver observer1 = new MobileDisplayObserverImpl(weatherObservable);
        NotificationAlertObserver observer2 = new MobileDisplayObserverImpl(weatherObservable);
        NotificationAlertObserver observer3 = new TvDisplayObserverImpl(weatherObservable);
        NotificationAlertObserver observer4 = new TvDisplayObserverImpl(weatherObservable);

        weatherObservable.add(observer1);
//        weatherObservable.add(observer2);
        weatherObservable.add(observer3);
//        weatherObservable.add(observer4);

        weatherObservable.setTemperature(10);
        System.out.println(weatherObservable.getTemperature());

        try {
            int temperature = 20;
            while (temperature != 25) {
                weatherObservable.setTemperature(temperature);
                Thread.sleep(1000);
                temperature += 1;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
