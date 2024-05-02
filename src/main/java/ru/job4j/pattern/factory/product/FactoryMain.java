package ru.job4j.pattern.factory.product;

public class FactoryMain {
    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.println("Created: " + product.getClass());
        }
    }
}
