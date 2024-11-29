package com.beingadish.learning;

import com.beingadish.learning.Entities.Customer;
import com.beingadish.learning.Observable.IphoneObservableImpl;
import com.beingadish.learning.Observer.EmailAlertObserverImpl;
import com.beingadish.learning.Observer.MobileAlertObserverImpl;

public class Main {
    public static void main(String[] args) {

        // Creation of Customers
        Customer c1 = new Customer("Aadarsh");
        Customer c2 = new Customer("Kush");
        Customer c3 = new Customer("Rupesh");
        Customer c4 = new Customer("Piyush");
        Customer c5 = new Customer("Kunal");

        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();
        iphoneObservable.setStockData(6);
        MobileAlertObserverImpl mobileAlertObserver = new MobileAlertObserverImpl(iphoneObservable);
        EmailAlertObserverImpl emailAlertObserver = new EmailAlertObserverImpl(iphoneObservable);

        // Aadarsh, Kush  Rupesh subscribed for Mobile Notifications
        mobileAlertObserver.addSubscribers(c1);
        mobileAlertObserver.addSubscribers(c2);
        mobileAlertObserver.addSubscribers(c3);

        // Aadarsh, Piyush & Kunal have subscriber for Email
        emailAlertObserver.addSubscribers(c1);
        emailAlertObserver.addSubscribers(c4);
        emailAlertObserver.addSubscribers(c5);

        // Aadarsh is Common in Both, so he should receive both Email & Mobile Alert for IPhone

        iphoneObservable.add(mobileAlertObserver);
        iphoneObservable.add(emailAlertObserver);
        try {
            iphoneObservable.deleteStockData(6);
        } catch (Exception e) {
            System.out.println("Error in deleting IPhones");
        }
        iphoneObservable.setStockData(1);
    }
}