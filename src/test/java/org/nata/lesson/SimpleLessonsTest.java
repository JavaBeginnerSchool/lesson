package org.nata.lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleLessonsTest {

    @Test
    public void solveMeFirst() {
        assertEquals(5, SimpleLessons.solveMeFirst(2, 3));
        assertEquals(30, SimpleLessons.solveMeFirst(10, 20));
    }

    @Test
    public void isOdd() {
        assertTrue(SimpleLessons.isOdd(3));
        assertFalse(SimpleLessons.isOdd(2));
    }
}