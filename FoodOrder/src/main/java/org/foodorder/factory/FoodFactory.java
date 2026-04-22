package org.foodorder.factory;

import org.foodorder.model.*;

public class FoodFactory {

    public static FoodItem createFood(String type) {
        if (type == null) {
            return null;
        }

        if (type.equals("pizza")) {
            return new Pizza();
        } else if (type.equals("burger")) {
            return new Burger();
        } else if (type.equals("salad")) {
            return new Salad();
        }

        return null;
    }
}