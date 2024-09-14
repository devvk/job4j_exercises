package ru.job4j.loop;

public class Task174 {

    public static void isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            System.out.println("Нет");
            return;
        }
        int reverted = 0;
        while (number > reverted) {
            reverted = reverted * 10 + number % 10;
            number /= 10;
        }
        System.out.println(number == reverted || number == reverted / 10 ? "Да" : "Нет");
    }
}
