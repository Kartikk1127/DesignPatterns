package org.kartikey.observerDesignPattern.followed.observer;

import org.kartikey.observerDesignPattern.followed.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String username, StockObservable observable){
        this.username = username;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(username,"product is in stock hurry up");
    }

    private void sendMessageOnMobile(String username, String s) {
        //logic to send the actual message
        System.out.println("Message sent to : " + username);
    }
}
