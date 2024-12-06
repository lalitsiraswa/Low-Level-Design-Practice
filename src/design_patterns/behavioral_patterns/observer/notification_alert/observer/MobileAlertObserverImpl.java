package design_patterns.behavioral_patterns.observer.notification_alert.observer;

import design_patterns.behavioral_patterns.observer.notification_alert.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    StockObservable observable;
    String userName;

    public MobileAlertObserverImpl(StockObservable observable, String userName) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product Is In Stock Hurry Up!");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("Message Sent To : " + userName);
        System.out.println("Message : " + message);
    }
}
