package ru.job4j.pattern.factory.player;

public class FactoryMain {
    public static void main(String[] args) {
        Creator[] creators = {new CreatorWarrior(), new CreatorMage(), new CreatorArcher()};
        for (Creator creator : creators) {
            Player player = creator.factoryMethod();
            System.out.printf("Created: %s\n", player.getClass());
        }
    }
}
