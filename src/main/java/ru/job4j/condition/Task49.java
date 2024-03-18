package ru.job4j.condition;

public class Task49 {
    public static void isPalindrome(int number) {
        String result = "Да";
        String str = String.valueOf(number);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = "Нет";
                break;
            }
        }
        System.out.println(result);
    }
}
