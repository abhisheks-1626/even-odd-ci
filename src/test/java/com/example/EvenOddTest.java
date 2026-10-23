
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(8));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", EvenOdd.checkEvenOdd(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(-4));
    }

    @Test
    void testNegativeOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(-3));
    }
}
