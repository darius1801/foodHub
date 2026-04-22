package org.foodorder.model;

public class Burger implements FoodItem{
    @Override
    public String getName() {
        return "Burger";
    }

    @Override
    public double getPrice() {
        return 35.0;
    }
}
