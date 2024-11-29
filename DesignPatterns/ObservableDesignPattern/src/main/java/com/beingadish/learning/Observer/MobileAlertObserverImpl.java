package com.beingadish.learning.Observer;

import com.beingadish.learning.Entities.Customer;
import com.beingadish.learning.Observable.StocksObservable;

import java.util.HashSet;
import java.util.Set;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    StocksObservable observable;

    // Unique Customers (To avoid duplicate customers in subscribers list)
    Set<Customer> customerSubscriberList = new HashSet<>();

    public MobileAlertObserverImpl(StocksObservable observable) {
        this.observable = observable;
    }

    @Override
    public void addSubscribers(Customer subscriber) {
        customerSubscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Customer subscriber) {
        customerSubscriberList.remove(subscriber);
    }

    @Override
    public void update() {
        if (observable.getStockCount() > 0) {
            for (Customer customerSubscriber : customerSubscriberList) {
                System.out.println("Hi! " + customerSubscriber.getName() + " MobileNotification : IPhones are back in sale !!");
            }
        }
    }
}
