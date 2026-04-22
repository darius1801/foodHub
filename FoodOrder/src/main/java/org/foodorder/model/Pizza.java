package org.foodorder.model;

public class Pizza implements FoodItem{
    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 45.0;
    }
}
