package ru.job4j.array;

import java.util.Random;

public class Questions {
    public static final int NO = 0;
    public static final int YES = 1;
    public static final int MAYBE = 2;
    public static final int LATER = 3;
    public static final int SOON = 4;
    public static final int NEVER = 5;
    private final Random rand = new Random();

    public int ask() {
        final int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return SOON;
        } else {
            return NEVER;
        }
    }

    public static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
            default:
                System.out.println("default");
        }
    }

    public static void main(String[] args) {
        Questions q = new Questions();
        for (int i = 0; i < 5; i++) {
            answer(q.ask());
        }
    }
}
