package com.beingadish.learning.Observable;

import com.beingadish.learning.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    private static Integer numberOfIphone = 0;

    List<NotificationAlertObserver> subscriberList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver alertObserver) {
        subscriberList.add(alertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver alertObserver) {
        subscriberList.remove(alertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver subscribers : subscriberList) {
            subscribers.update();
        }
    }

    @Override
    public void setStockData(Integer newStockAdded) {
        numberOfIphone += newStockAdded;
        notifySubscribers();
    }

    @Override
    public void deleteStockData(Integer stockRemoved) throws Exception {
        if (stockRemoved > numberOfIphone) {
            throw new Exception(stockRemoved + " iPhones are not present");
        } else {
            numberOfIphone -= stockRemoved;
        }
    }

    @Override
    public int getStockCount() {
        return numberOfIphone;
    }
}
