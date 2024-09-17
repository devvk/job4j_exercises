package ru.job4j.map;

import java.util.Map;

public class RomanToArabicConverter {

    /**
     * Таблица соответствия римских символов и их значений.
     */
    private static final Map<Character, Integer> MAP = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    /**
     * Преобразует римское число в арабское.
     *
     * @param roman римское целое число.
     * @return арабское целое число.
     */
    public int convert(String roman) {
        if (!isValidRoman(roman)) {
            throw new IllegalArgumentException("Некорректное римское число: " + roman);
        }
        int sum = 0;
        int prevValue = MAP.get(roman.charAt(0));
        for (int i = 1; i < roman.length(); i++) {
            int currentValue = MAP.get(roman.charAt(i));
            sum = prevValue < currentValue ? sum - prevValue : sum + prevValue;
            prevValue = currentValue;
        }
        sum += prevValue;
        return sum;
    }

    /**
     * Проверяет валидность римского числа.
     *
     * @param roman римское целое число.
     * @return возвращает true, если римское число валидное, иначе false
     */
    private boolean isValidRoman(String roman) {
        if (roman == null || roman.isEmpty() || !isValidRomanSequence(roman)) {
            return false;
        }
        int repeatCount = 1;
        char prevChar = roman.charAt(0);
        for (int i = 1; i < roman.length(); i++) {
            char currentChar = roman.charAt(i);
            if (currentChar == prevChar) {
                repeatCount++;
                // Проверка на более трех одинаковых символов подряд
                if (repeatCount > 3 && (currentChar == 'I'
                        || currentChar == 'X' || currentChar == 'C' || currentChar == 'M')) {
                    return false;
                }
                // Символы V, L и D не могут повторяться
                if (currentChar == 'V' || currentChar == 'L' || currentChar == 'D') {
                    return false;
                }
            } else {
                repeatCount = 1;
            }
            prevChar = currentChar;
        }
        return true;
    }

    /**
     * Проверяет запрещенные комбинации символов.
     *
     * @param roman римское целое число.
     * @return возвращает true, если нет запрещенных комбинаций, иначе false
     */
    private boolean isValidRomanSequence(String roman) {
        return !(roman.contains("IL") || roman.contains("IC")
                || roman.contains("VX") || roman.contains("VL")
                || roman.contains("VC") || roman.contains("XD")
                || roman.contains("XM") || roman.contains("LC")
                || roman.contains("LD") || roman.contains("DM"));
    }
}
