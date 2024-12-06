package design_patterns.behavioral_patterns.observer;

import design_patterns.behavioral_patterns.observer.observable.IphoneObservableImpl;
import design_patterns.behavioral_patterns.observer.observable.StockObservable;
import design_patterns.behavioral_patterns.observer.observer.EmailAlertObserverImpl;
import design_patterns.behavioral_patterns.observer.observer.MobileAlertObserverImpl;
import design_patterns.behavioral_patterns.observer.observer.NotificationAlertObserver;

public class StoreClient {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphoneStockObservable, "jaydeep@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneStockObservable, "krishna@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphoneStockObservable, "dadheechsuraj");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
