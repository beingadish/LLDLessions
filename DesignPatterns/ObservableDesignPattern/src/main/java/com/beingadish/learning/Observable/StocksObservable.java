package com.beingadish.learning.Observable;

import com.beingadish.learning.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver alertObserver);

    public void remove(NotificationAlertObserver alertObserver);

    public void notifySubscribers();

    public void setStockData(Integer newStockAdded);

    public void deleteStockData(Integer stockRemoved) throws Exception;

    public int getStockCount();

}
