package ru.job4j.pattern.factory.player;

public class CreatorWarrior extends Creator {

    @Override
    public Player factoryMethod() {
        return new PlayerWarrior();
    }
}
