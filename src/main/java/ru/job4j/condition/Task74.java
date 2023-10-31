package ru.job4j.condition;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        String num2String = Integer.toString(num2);
        String num4String = Integer.toString(num4);

        if (num4String.contains(num2String)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
