package org.nata.lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysLessonsTest {

    @Test
    public void findNumberByIndex() {
        int[] array = {0, 10, 20, 30, 40};
        assertEquals(10, ArraysLessons.findNumberByIndex(array, 1));
        assertEquals(-1, ArraysLessons.findNumberByIndex(array, 10));
    }

    @Test
    public void findIndexOfNumber() {
        int[] array = {0, 10, 20, 30, 40};
        assertEquals(2, ArraysLessons.findIndexOfNumber(array, 20));
        assertEquals(-1, ArraysLessons.findIndexOfNumber(array, 50));
    }
}