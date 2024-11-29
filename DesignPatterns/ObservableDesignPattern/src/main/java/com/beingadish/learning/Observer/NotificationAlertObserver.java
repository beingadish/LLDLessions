package com.beingadish.learning.Observer;

import com.beingadish.learning.Entities.Customer;

public interface NotificationAlertObserver {

    public void addSubscribers(Customer subscriber);
    public void removeSubscriber(Customer subscriber);
    public void update();
}
