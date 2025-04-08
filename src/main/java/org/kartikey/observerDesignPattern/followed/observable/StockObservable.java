package org.kartikey.observerDesignPattern.followed.observable;

import org.kartikey.observerDesignPattern.followed.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
