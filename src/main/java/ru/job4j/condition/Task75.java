package ru.job4j.condition;

public class Task75 {
    public static void innerNum(int num2, int num4) {
        String substr = Integer.toString(num2);
        String str = Integer.toString(num4);
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).contains(substr)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        innerNum(12, 12266312);
    }
}
