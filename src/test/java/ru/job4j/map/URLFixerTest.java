package ru.job4j.map;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class URLFixerTest {

    @Test
    public void testFixQueryWithValidParams() {
        URLFixer urlFixer = new URLFixer();
        String query = "fooyes&barbaz&utm_sourcebar";
        List<String> validParams = Arrays.asList("foo", "bar", "utm_source");
        String expected = "foo=yes&bar=baz&utm_source=bar";
        String result = urlFixer.fixQuery(query, validParams);
        assertEquals(expected, result);
    }

    @Test
    public void testFixQueryWithoutErrors() {
        URLFixer urlFixer = new URLFixer();
        String query = "foo=yes&bar=baz&utm_source=bar";
        List<String> validParams = Arrays.asList("foo", "bar", "utm_source");
        String expected = "foo=yes&bar=baz&utm_source=bar";
        String result = urlFixer.fixQuery(query, validParams);
        assertEquals(expected, result);
    }

    @Test
    public void testFixQueryWithUnknownParams() {
        URLFixer urlFixer = new URLFixer();
        String query = "fooyes&unknownparam";
        List<String> validParams = List.of("foo");
        String expected = "foo=yes&unknownparam";
        String result = urlFixer.fixQuery(query, validParams);
        assertEquals(expected, result);
    }

    @Test
    public void testFixQueryWithMultipleValidParams() {
        URLFixer urlFixer = new URLFixer();
        String query = "fooyes&barbaz&foobazvalue";
        List<String> validParams = Arrays.asList("foo", "bar", "foobaz");
        String expected = "foo=yes&bar=baz&foobaz=value";
        String result = urlFixer.fixQuery(query, validParams);
        assertEquals(expected, result);
    }
}
