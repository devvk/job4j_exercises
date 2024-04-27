package ru.job4j.pattern.strategy;

public interface ShippingStrategy {
    double COST_WEIGHT = 3.5;
    double COST_VOLUME = 0.5;
    double COST_DISTANCE = 0.5;

    double calculateShippingCost(double weight, double volume, double distance);
}
