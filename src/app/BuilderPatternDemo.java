package app;

import app.builder.OrderBuilder;
import app.entities.Order;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order ordA = orderBuilder.orderA();
        System.out.println("Order A:");
        ordA.showItems();
        System.out.println("Total Cost: " + ordA.getCost() + " " + "USD");

        Order ordB = orderBuilder.orderB();
        System.out.println("\n" + "Order B:");
        ordB.showItems();
        System.out.println("Total Cost: " + ordB.getCost() + " " + "USD");
    }
}