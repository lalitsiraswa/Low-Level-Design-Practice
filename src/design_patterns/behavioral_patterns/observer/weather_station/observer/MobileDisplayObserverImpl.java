package design_patterns.behavioral_patterns.observer.weather_station.observer;

import design_patterns.behavioral_patterns.observer.weather_station.observable.WeatherObservable;

public class MobileDisplayObserverImpl implements NotificationAlertObserver {
    WeatherObservable observable;

    // Constructor Injection
    public MobileDisplayObserverImpl(WeatherObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Mobile Displays Temperature: " + observable.getTemperature() + " Degrees Celsius!");
    }
}
