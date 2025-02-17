package design_patterns.behavioral_patterns.observer.notification_alert.observable;

import design_patterns.behavioral_patterns.observer.notification_alert.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    public int stockCount = 0;

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
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            stockCount = stockCount + newStockAdded;
            notifySubscribers();
        } else {
            stockCount = stockCount + newStockAdded;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
