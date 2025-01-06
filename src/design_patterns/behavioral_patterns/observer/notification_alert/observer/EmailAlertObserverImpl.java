package design_patterns.behavioral_patterns.observer.notification_alert.observer;

import design_patterns.behavioral_patterns.observer.notification_alert.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    StockObservable observable;
    String emailId;

    // Constructor Injection
    public EmailAlertObserverImpl(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product Is In Stock Hurry Up!");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("Email Sent To : " + emailId);
        System.out.println("Message : " + message);
        System.out.println("Stock Count : " + observable.getStockCount());
    }
}
