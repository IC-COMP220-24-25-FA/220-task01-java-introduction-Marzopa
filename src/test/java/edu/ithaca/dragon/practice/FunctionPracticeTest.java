package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        // This so that it doesn't matter which order the numbers are put in
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        // Same number three times
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        // Checks that throws error if any (or all) arguments are negative
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(115, FunctionPractice.calcSalePrice(100, 0, 15));
        assertEquals(120, FunctionPractice.calcSalePrice(200, 50, 20));
        assertEquals(160.28, FunctionPractice.calcSalePrice(157.14, 15, 20), 0.01);
        assertEquals(0, FunctionPractice.calcSalePrice(1, 100, 15));
    }
    }

