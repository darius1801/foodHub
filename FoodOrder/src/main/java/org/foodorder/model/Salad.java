package org.foodorder.model;

public class Salad implements FoodItem{
    @Override
    public String getName() {
        return "Salad";
    }

    @Override
    public double getPrice() {
        return 25.0;
    }
}
