package ru.job4j.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int apsPerFloor = 3;
        int floor = (number - 1) / apsPerFloor + 1;
        int place = (number - 1) % apsPerFloor + 1;
        System.out.println(floor);
        System.out.println(place);
    }
}
