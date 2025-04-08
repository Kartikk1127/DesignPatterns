package org.kartikey.observerDesignPattern.followed;

import org.kartikey.observerDesignPattern.followed.observable.IphoneObservableImpl;
import org.kartikey.observerDesignPattern.followed.observable.StockObservable;
import org.kartikey.observerDesignPattern.followed.observer.EmailAlertObserverImpl;
import org.kartikey.observerDesignPattern.followed.observer.MobileAlertObserverImpl;
import org.kartikey.observerDesignPattern.followed.observer.NotificationAlertObserver;

public class Main {
    public static void main(String [] args){
        StockObservable observable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",observable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com",observable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Kartikey",observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);
    }
}
