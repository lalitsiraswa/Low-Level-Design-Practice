package design_patterns.behavioral_patterns.observer.weather_station.observable;

import design_patterns.behavioral_patterns.observer.weather_station.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements WeatherObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    public int temperature = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifySubscribers();
    }

    @Override
    public int getTemperature() {
        return this.temperature;
    }
}
