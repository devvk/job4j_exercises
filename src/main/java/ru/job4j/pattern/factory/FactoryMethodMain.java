package ru.job4j.pattern.factory;

public class FactoryMethodMain {
    public static WatchMaker createWatchMakerByName(MakerType type) {
        return switch (type) {
            case DIGITAL -> new DigitalWatchMaker();
            case ROME -> new RomeWatchMaker();
        };
    }

    public static void main(String[] args) {
        WatchMaker maker = createWatchMakerByName(MakerType.DIGITAL);
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}
