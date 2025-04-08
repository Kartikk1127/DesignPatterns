package org.kartikey.observerDesignPattern.followed.observer;

import org.kartikey.observerDesignPattern.followed.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;
    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId,"product is in stock hurry up");
    }

    private void sendMail(String emailId, String s) {
        //logic to send the mail
        System.out.println("Mail sent to : " + emailId);
    }
}
