package edu.ithaca.dragon.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

    @Test
    public void isGoodDogTest(){
        // If brought the paper today, always good dog
        assertTrue(FunctionPractice.isGoodDog(2, 0, true));

        // If dog is over 30 (dead), dog was good today
        assertTrue(FunctionPractice.isGoodDog(32, 0, false));

        // If days since last shoe chewed is at least the same as twice the age, unless the dog is 5 or over, good dog
        assertTrue(FunctionPractice.isGoodDog(4, 8, false));
        assertFalse(FunctionPractice.isGoodDog(4, 7, false));
        assertTrue(FunctionPractice.isGoodDog(2, 4, false));
        assertFalse(FunctionPractice.isGoodDog(5, 1, false));
        assertFalse(FunctionPractice.isGoodDog(5, 0, false));
    }

    @Test
    public void findFirstLargestTest(){
        List<Integer> testList = new ArrayList<>();
        assertEquals(-1, FunctionPractice.findFirstLargest(testList));
        testList.add(5);
        testList.add(4);
        testList.add(-1);
        assertEquals(0, FunctionPractice.findFirstLargest(testList));
        testList.add(6);
        assertEquals(3, FunctionPractice.findFirstLargest(testList));
        testList.add(6);
        testList.add(6);
        assertEquals(3, FunctionPractice.findFirstLargest(testList));
        testList.add(2);
        assertEquals(3, FunctionPractice.findFirstLargest(testList));

    }

    @Test
    public void findLastLargestTest(){
        ArrayList<Integer> testList = new ArrayList<>();
        assertEquals(-1, FunctionPractice.findLastLargest(testList));
        testList.add(5);
        testList.add(4);
        testList.add(-1);
        assertEquals(0, FunctionPractice.findLastLargest(testList));
        testList.add(6);
        assertEquals(3, FunctionPractice.findLastLargest(testList));
        testList.add(6);
        assertEquals(4, FunctionPractice.findLastLargest(testList));
        testList.add(6);
        assertEquals(5, FunctionPractice.findLastLargest(testList));
        testList.add(2);
        assertEquals(5, FunctionPractice.findLastLargest(testList));

    }

    @Test
    public void findFirstMostOccurencesOfLetter(){
        ArrayList<String> testList = new ArrayList<>();
        testList.add("abc");
        assertEquals("abc", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'a'));
        testList.add("pirp");
        assertEquals("abc", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'a'));
        assertEquals("pirp", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'p'));
        testList.add("ap");
        assertEquals("pirp", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'p'));
        testList.add("pirpipp");
        assertEquals("pirpipp", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'p'));
        assertThrows(NoSuchElementException.class, () -> FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'z'));
    }
    }
