package ru.job4j.pattern.factory.player;

public class CreatorArcher extends Creator {
    @Override
    public Player factoryMethod() {
        return new PlayerArcher();
    }
}
