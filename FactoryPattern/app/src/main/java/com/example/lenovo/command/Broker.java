package com.example.lenovo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2019/4/3.
 */

public class Broker {
    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
