package app.builder;

import app.entities.Order;
import app.products.BlackCap;
import app.products.BlueTshirt;
import app.products.RedTshirt;
import app.products.WhiteCap;

public class OrderBuilder {

    public Order orderA() {
        Order order = new Order();
        order.addItem(new RedTshirt());
        order.addItem(new WhiteCap());
        return order;
    }

    public Order orderB() {
        Order order = new Order();
        order.addItem(new BlueTshirt());
        order.addItem(new BlackCap());
    return order;
    }
}