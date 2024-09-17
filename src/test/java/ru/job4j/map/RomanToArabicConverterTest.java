package ru.job4j.map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanToArabicConverterTest {

    private final RomanToArabicConverter converter = new RomanToArabicConverter();

    @Test
    public void testConvertSimple() {
        assertEquals(10, converter.convert("X"));
    }

    @Test
    public void testConvertComplex() {
        assertEquals(1994, converter.convert("MCMXCIV"));
    }

    @Test
    public void testConvertSingleSymbol() {
        assertEquals(1, converter.convert("I"));
        assertEquals(5, converter.convert("V"));
        assertEquals(1000, converter.convert("M"));
    }

    @Test
    public void testConvertWithSubtractiveNotation() {
        assertEquals(4, converter.convert("IV"));
        assertEquals(9, converter.convert("IX"));
        assertEquals(40, converter.convert("XL"));
        assertEquals(90, converter.convert("XC"));
        assertEquals(400, converter.convert("CD"));
        assertEquals(900, converter.convert("CM"));
    }

    @Test
    public void testConvertInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert("IIII"); // Некорректное римское число
        });
    }

    @Test
    public void testConvertEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(""); // Пустая строка, невалидный ввод
        });
    }

    @Test
    public void testInvalidRomanSequenceInput() {
        assertInvalidRomanSequence("IL");
        assertInvalidRomanSequence("IC");
        assertInvalidRomanSequence("VX");
        assertInvalidRomanSequence("VL");
        assertInvalidRomanSequence("VC");
        assertInvalidRomanSequence("XD");
        assertInvalidRomanSequence("XM");
        assertInvalidRomanSequence("LC");
        assertInvalidRomanSequence("LD");
        assertInvalidRomanSequence("DM");
    }

    private void assertInvalidRomanSequence(String input) {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(input),
                "Expected IllegalArgumentException for input '" + input + "'");
    }
}

