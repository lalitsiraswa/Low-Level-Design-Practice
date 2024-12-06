package design_patterns.behavioral_patterns.observer.weather_station.observable;

import design_patterns.behavioral_patterns.observer.weather_station.observer.NotificationAlertObserver;

public interface WeatherObservable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setTemperature(int temperature);

    int getTemperature();
}
