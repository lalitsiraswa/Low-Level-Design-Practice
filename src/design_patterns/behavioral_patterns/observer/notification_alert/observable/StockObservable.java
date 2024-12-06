package design_patterns.behavioral_patterns.observer.notification_alert.observable;

import design_patterns.behavioral_patterns.observer.notification_alert.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
