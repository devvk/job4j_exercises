package ru.job4j.obj;

import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task13Test {

    @Test
    public void whenLocalClassThenFalse() {
        assertFalse(Task13.Nested.class.isLocalClass());
    }

    @Test
    public void whenMemberClassThenTrue() {
        assertTrue(Task13.Nested.class.isMemberClass());
    }

    @Test
    public void whenStaticThenTrue() {
        assertTrue(Modifier.isStatic(Task13.Nested.class.getModifiers()));
    }

    @Test
    public void whenAnonymousClassThenFalse() {
        assertFalse(Task13.Nested.class.isAnonymousClass());
    }

}
