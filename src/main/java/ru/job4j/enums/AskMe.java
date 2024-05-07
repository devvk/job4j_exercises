package ru.job4j.enums;

import java.util.*;

enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    private final Random r = new Random();

    public Answers ask() {
        int prob = (int) (100 * r.nextDouble());

        if (prob < 15) {
            return Answers.MAYBE;
        } else if (prob < 30) {
            return Answers.NO;
        } else if (prob < 60) {
            return Answers.YES;
        } else if (prob < 75) {
            return Answers.LATER;
        } else if (prob < 98) {
            return Answers.SOON;
        } else {
            return Answers.NEVER;
        }
    }
}

class AskMe {
    public static void answer(Answers result) {
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
                System.out.println("Скоро");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
            default:
                System.out.println("Неизвестный результат!");
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        for (int i = 0; i < 5; i++) {
            answer(question.ask());
        }
    }
}
