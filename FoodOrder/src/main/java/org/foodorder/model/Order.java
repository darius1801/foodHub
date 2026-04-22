package org.foodorder.model;

import org.foodorder.strategy.PaymentStrategy;

public class Order {
    private FoodItem foodItem;
    private PaymentStrategy paymentStrategy;

    public Order(FoodItem foodItem, PaymentStrategy paymentStrategy) {
        this.foodItem = foodItem;
        this.paymentStrategy = paymentStrategy;
    }

    public void placeOrder() {
        if (foodItem == null) {
            System.out.println("Invalid food item");
            return;
        }

        if (paymentStrategy == null) {
            System.out.println("No payment method selected");
            return;
        }

        System.out.println("Order placed: " + foodItem.getName());
        System.out.println("Price: " + foodItem.getPrice() + " RON");
        paymentStrategy.pay(foodItem.getPrice());
    }
}