package ru.job4j.condition;

import java.util.StringJoiner;

public class Task57 {
    public static void triangleType(int a, int b) {
        int c = 180 - (a + b);
        StringJoiner sj = new StringJoiner(" ");

        if (a + b >= 180 || a <= 0 || b <= 0) {
            System.out.println("Ошибка");
            return;
        }

        if (a < 90 && b < 90 && c < 90) {
            sj.add("Остроугольный");
        }

        if (a == 90 || b == 90 || c == 90) {
            sj.add("Прямоугольный");
        }

        if (a > 90 || b > 90 || c > 90) {
            sj.add("Тупоугольный");
        }

        if (a == b || a == c || c == b) {
            sj.add("Равнобедренный");

            if (a == 60 && b == 60) {
                sj.add("Равносторонний");
            }
        } else if (a == 45 && b == 45) {
            sj.add("Равнобедренный прямоугольный");
        }

        System.out.println(sj);
    }
}
