package ru.job4j.pattern.factory.player;

public class CreatorMage extends Creator {
    @Override
    public Player factoryMethod() {
        return new PlayerMage();
    }
}
