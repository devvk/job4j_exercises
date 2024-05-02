package ru.job4j.pattern.factory.product;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
