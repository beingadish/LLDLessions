package com.beingadish.learning.Observer;

import com.beingadish.learning.Entities.Customer;
import com.beingadish.learning.Observable.StocksObservable;

import java.util.HashSet;
import java.util.Set;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    StocksObservable observableEntity;

    Set<Customer> customerSubscribers = new HashSet<>();

    public EmailAlertObserverImpl(StocksObservable observableEntity) {
        this.observableEntity = observableEntity;
    }

    @Override
    public void addSubscribers(Customer subscriber) {
        customerSubscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Customer subscriber) {
        customerSubscribers.remove(subscriber);
    }

    @Override
    public void update() {
        if (observableEntity.getStockCount() > 0) {
            for (Customer customerSubscriber : customerSubscribers) {
                System.out.println("Email Sent to " + customerSubscriber.getName() + ": IPhones are back in sale !!");
            }
        }
    }
}
