package org.foodorder;

import org.foodorder.factory.*;
import org.foodorder.model.*;
import org.foodorder.strategy.*;

public class Main {

    public static void main(String[] args) {
        FoodItem food1 = FoodFactory.createFood("pizza");
        PaymentStrategy payment1 = new CardPayment();
        Order order1 = new Order(food1, payment1);
        order1.placeOrder();

        System.out.println();

        FoodItem food2 = FoodFactory.createFood("burger");
        PaymentStrategy payment2 = new CashPayment();
        Order order2 = new Order(food2, payment2);
        order2.placeOrder();

        System.out.println();

        FoodItem food3 = FoodFactory.createFood("salad");
        PaymentStrategy payment3 = new CashPayment();
        Order order3 = new Order(food3, payment3);
        order3.placeOrder();
    }
}