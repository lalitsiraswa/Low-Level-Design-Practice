package design_patterns.behavioral_patterns.observer.weather_station.observer;

import design_patterns.behavioral_patterns.observer.weather_station.observable.WeatherObservable;

public class TvDisplayObserverImpl implements NotificationAlertObserver {
    WeatherObservable observable;

    // Constructor Injection
    public TvDisplayObserverImpl(WeatherObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("TV Displays Temperature: " + observable.getTemperature() + " Degrees Celsius!");
    }
}
